package classwork.projects.tasktracker.models;

import classwork.projects.tasktracker.util.TaskType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Epic extends Task {

    private List<Subtask> subtasks;

    public Epic(int id, String summary, String description, int duration) {
        super(id, summary, description, TaskType.EPIC,duration);
        this.subtasks = new ArrayList<>();
    }

    public List<Subtask> getSubtasks() {
        return subtasks;
    }

    public void addSubtasks(Subtask subtask) {
        subtasks.add(subtask);
    }

}
