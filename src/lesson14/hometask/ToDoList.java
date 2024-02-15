package lesson14.hometask;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    private final List<String> toDoList;

    public ToDoList() {
        this.toDoList = new ArrayList<>();
    }

    public void findAllTask() {
        for(int taskIndex = 0; taskIndex < toDoList.size(); taskIndex++) {
            System.out.println(taskIndex+1+". " + toDoList.get(taskIndex));
        }
    }

    public void addTask(String task) {
        toDoList.add(task);
    }

    public void removeTask(int taskIndex) {
        toDoList.remove(--taskIndex);
    }

}
