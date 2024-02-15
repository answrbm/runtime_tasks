package lesson14.hometask;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter option: \n1. Add task\n2.Print all tasks\n3. Delete task\n0. Exit");

        String option;
        while(!(option = scanner.nextLine()).equals("0")) {
            System.out.println("Enter option: \n1. Add task\n2. Print all tasks\n3. Delete task\n0. Exit");
            switch (option) {
                case "1" : {
                    System.out.println("1 <enter>");
                    System.out.println("Enter your task:");
                    String newTask = scanner.next();
                    toDoList.addTask(newTask);
                }
                break;
                case "2" : {
                    System.out.println("2 <enter>");
                    toDoList.findAllTask();
                }
                break;
                case "3" : {
                    System.out.println("3 <enter>");
                    System.out.println("Enter task number to delete:");
                    int taskIndex = scanner.nextInt();
                    toDoList.removeTask(taskIndex);
                }
            }
        }
        System.out.println("0 <enter>");
    }
}
