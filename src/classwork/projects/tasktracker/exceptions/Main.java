package classwork.projects.tasktracker.exceptions;

import classwork.projects.tasktracker.models.*;
import classwork.projects.tasktracker.util.Status;

public class Main {

    public static void main(String[] args) throws TaskNotFoundException {
        ManagerImpl managerImpl = new ManagerImpl();

        Task task1 = new Task(1,"Task1 summary","Task1 description");
        Task task2 = new Task(2,"Task2 summary","Task2 description");

        Epic epic1 = new Epic(3,"Epic1 summary","Epic1 description");
        epic1.addSubtasks(new Subtask(5,"Subtask1 summary","Subtask1 description",epic1));
        epic1.addSubtasks(new Subtask(6,"Subtask2 summary","Subtask2 description",epic1));

        Epic epic2 = new Epic(4,"Epic2 summary","Epic2 description");
        epic2.addSubtasks(new Subtask(7,"Subtask3 summary","Subtask3 description",epic2));

        managerImpl.addTask(task1);
        managerImpl.addTask(task2);
        managerImpl.addTask(epic1);
        managerImpl.addTask(epic2);

        managerImpl.getTasks().forEach(System.out::println);
        System.out.println("********");

        epic1.getSubtasks().get(0).setStatus(Status.IN_PROGRESS);
        epic2.getSubtasks().get(0).setStatus(Status.DONE);
        managerImpl.updateTask(epic1);
        managerImpl.updateTask(epic2);

        managerImpl.getTasks().forEach(System.out::println);
        System.out.println("********");

        managerImpl.deleteById(task1.getTaskId());

        managerImpl.getTasks().forEach(System.out::println);
    }
}
