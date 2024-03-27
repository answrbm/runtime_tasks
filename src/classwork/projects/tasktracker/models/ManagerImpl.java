package classwork.projects.tasktracker.models;

import classwork.projects.tasktracker.exceptions.TaskNotFoundException;
import classwork.projects.tasktracker.util.Status;

import java.util.ArrayList;
import java.util.List;

public class ManagerImpl implements Manager {

    private List<Task> tasks;

    public ManagerImpl() {
        this.tasks = new ArrayList<>();
    }

    @Override
    public List<Task> findAll() {
        return tasks;
    }

    @Override
    public void deleteAll() {
        tasks.clear();
    }

    @Override
    public void save(Task newTask) {
        newTask.setStatus(calculateStatus(newTask));
        tasks.add(newTask);
    }

    @Override
    public void update(Task updatedTask) throws TaskNotFoundException {
        Task foundTask = findById(updatedTask.getTaskId());
        Status status = calculateStatus(updatedTask);
        updatedTask.setStatus(status);
        tasks.set(tasks.indexOf(foundTask), updatedTask);
    }

    @Override
    public Task findById(int taskId) throws TaskNotFoundException {
        return tasks.stream().filter(task -> task.getTaskId() == taskId).findAny()
                .orElseThrow(TaskNotFoundException::new);
    }

    @Override
    public void deleteById(int taskId) throws TaskNotFoundException {
        Task foundTask = findById(taskId);
        tasks.remove(foundTask);
    }

    private Status calculateStatus(Task task) {
        if(task instanceof Epic) {
            Epic epic = (Epic) task;
            List<Subtask> subtasks = epic.getSubtasks();

            if(subtasks.stream().allMatch(subtask -> subtask.getStatus().equals(Status.NEW))
                    || subtasks.isEmpty())
                epic.setStatus(Status.NEW);
            else if(subtasks.stream().allMatch(subtask -> subtask.getStatus().equals(Status.DONE)))
                epic.setStatus(Status.DONE);
            else
                epic.setStatus(Status.IN_PROGRESS);

            return epic.getStatus();
        }

        return task.getStatus();
    }


}
