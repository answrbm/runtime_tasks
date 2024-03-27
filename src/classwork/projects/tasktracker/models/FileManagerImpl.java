package classwork.projects.tasktracker.models;

import classwork.projects.tasktracker.exceptions.TaskNotFoundException;
import classwork.projects.tasktracker.util.Status;
import classwork.projects.tasktracker.util.TaskType;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FileManagerImpl implements Manager {

    private final String fileName;

    public FileManagerImpl(String fileName) {
        this.fileName = fileName;

    }

    @Override
    public List<Task> findAll() {
        List<Task> tasks = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while(reader.ready()) {
                Task task = taskMapper(reader.readLine());
                tasks.add(task);
            }

            return enrichTasks(tasks);
        } catch (IOException e) {
            System.out.println("File not found");
            return null;
        }
    }

    private List<Task> enrichTasks(List<Task> tasks) {
        List<Task> enrichedTasks = new ArrayList<>();
        for(int i = 0; i < tasks.size(); i++) {
            Task t = tasks.get(i);
            if(t instanceof Epic) {
                Epic e = (Epic) t;
                tasks.stream()
                        .filter(task -> task instanceof Subtask)
                        .filter(task -> ((Subtask) task).getEpicId() == t.getTaskId())
                        .forEach(task -> e.addSubtasks((Subtask) task));
                enrichedTasks.add(e);
            }
        }
        return enrichedTasks;
    }

    @Override
    public Task findById(int taskId) throws TaskNotFoundException {
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while(reader.ready()) {
                Task t = taskMapper(reader.readLine());
                if(t.getTaskId() == taskId)
                    return t;
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
        throw new TaskNotFoundException();
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void save(Task newTask) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(taskMapper(newTask));
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

    @Override
    public void update(Task updatedTask) throws TaskNotFoundException {

    }

    @Override
    public void deleteById(int taskId) throws TaskNotFoundException {

    }

    private Task taskMapper(String taskLine) {
        String[] taskParts = taskLine.split(",");
        int id = Integer.parseInt(taskParts[0]);
        String summary = taskParts[1];
        String description = taskParts[2];
        TaskType taskType = taskTypeMapper(taskParts[3]);
        Status status = statusMapper(taskParts[4]);
        LocalDateTime createdAt = dateMapper(taskParts[5]);
        int duration = Integer.parseInt(taskParts[6]);

        if(taskType == TaskType.EPIC) {
            Epic e = new Epic(id,summary,description,duration);
            e.setCreatedAt(createdAt);
            e.setStatus(status);

            return e;
        } else if(taskType == TaskType.SUBTASK) {
            int epicId = Integer.parseInt(taskParts[7]);
            Subtask s = new Subtask(id,summary,description,duration,epicId);
            s.setCreatedAt(createdAt);
            s.setStatus(status);

            return s;
        } else {
            Task t = new Task(id,summary,description,taskType,duration);
            t.setCreatedAt(createdAt);
            t.setStatus(status);

            return t;
        }
    }

    private String taskMapper(Task task) {
        StringBuilder taskBuilder = new StringBuilder();

        taskBuilder.append(task.getTaskId());
        taskBuilder.append(",");
        taskBuilder.append(task.getSummary());
        taskBuilder.append(",");
        taskBuilder.append(task.getDescription());
        taskBuilder.append(",");
        taskBuilder.append(task.getTaskType());
        taskBuilder.append(",");
        taskBuilder.append(task.getStatus());
        taskBuilder.append(",");
        taskBuilder.append(dateMapper(task.getCreatedAt()));
        taskBuilder.append(",");
        taskBuilder.append(task.getDuration());
        taskBuilder.append(",");

        if(task.getTaskType() == TaskType.EPIC) {
            taskBuilder.append("null");
        }
        if(task.getTaskType() == TaskType.SUBTASK) {
            Subtask subtask = (Subtask) task;
            taskBuilder.append(subtask.getEpicId());
        }

        return taskBuilder.toString();
    }

    private String dateMapper(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");
        return formatter.format(dateTime);
    }

    private LocalDateTime dateMapper(String dateTimeLine) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");
        return LocalDateTime.parse(dateTimeLine,formatter);
    }

    private Status statusMapper(String status) {
        return Status.valueOf(status);
    }

    private TaskType taskTypeMapper(String taskType) {
        return TaskType.valueOf(taskType);
    }
}
