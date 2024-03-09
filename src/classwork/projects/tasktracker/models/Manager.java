package classwork.projects.tasktracker.models;

import classwork.projects.tasktracker.exceptions.TaskNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Manager {

    private List<Task> tasks;

    public Manager() {
        this.tasks = new ArrayList<>();
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task newTask) {
        newTask.setStatus(calculateStatus(newTask));
        tasks.add(newTask);
    }

    public void addTasks(List<Task> tasks) {
        this.tasks.addAll(tasks);
    }

    public void deleteAllTasks() {
        tasks.clear();
    }

    public Task findById(int taskId) throws TaskNotFoundException {
        return tasks.stream().filter(task -> task.getTaskId() == taskId).findAny()
                .orElseThrow(TaskNotFoundException::new);
    }

    public void updateTask(Task updatedTask) throws TaskNotFoundException {
        Task foundTask = findById(updatedTask.getTaskId());
        Status status = calculateStatus(updatedTask);
        updatedTask.setStatus(status);
        tasks.set(tasks.indexOf(foundTask), updatedTask);
    }

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
