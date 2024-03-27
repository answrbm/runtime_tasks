package classwork.projects.tasktracker.models;

import classwork.projects.tasktracker.exceptions.TaskNotFoundException;
import classwork.projects.tasktracker.util.Status;

import java.io.FileNotFoundException;
import java.util.List;

public interface Manager {

    List<Task> findAll() throws FileNotFoundException;

    Task findById(int taskId) throws TaskNotFoundException;

    void deleteAll();

    void save(Task newTask);

    void update(Task updatedTask) throws TaskNotFoundException;

    void deleteById(int taskId) throws TaskNotFoundException;

}