package classwork.projects.tasktracker.exceptions;

import classwork.projects.tasktracker.models.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws TaskNotFoundException {
        Manager manager = new Manager();

        Task task1 = new Task(1,"Task1 summary","Task1 description");
        Task task2 = new Task(2,"Task2 summary","Task2 description");

        Epic epic1 = new Epic(3,"Epic1 summary","Epic1 description");
        epic1.addSubtasks(new Subtask(5,"Subtask1 summary","Subtask1 description",epic1));
        epic1.addSubtasks(new Subtask(6,"Subtask2 summary","Subtask2 description",epic1));

        Epic epic2 = new Epic(4,"Epic2 summary","Epic2 description");
        epic2.addSubtasks(new Subtask(7,"Subtask3 summary","Subtask3 description",epic2));

        manager.addTask(task1);
        manager.addTask(task2);
        manager.addTask(epic1);
        manager.addTask(epic2);

        manager.getTasks().forEach(System.out::println);
        System.out.println("********");

        epic1.getSubtasks().get(0).setStatus(Status.IN_PROGRESS);
        epic2.getSubtasks().get(0).setStatus(Status.DONE);
        manager.updateTask(epic1);
        manager.updateTask(epic2);

        manager.getTasks().forEach(System.out::println);
        System.out.println("********");

        manager.deleteById(task1.getTaskId());

        manager.getTasks().forEach(System.out::println);
    }
}
