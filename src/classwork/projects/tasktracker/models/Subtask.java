package classwork.projects.tasktracker.models;

import classwork.projects.tasktracker.util.TaskType;

import java.util.Objects;

public class Subtask extends Task {

    private int epicId;

    public Subtask(int id, String summary, String description, int duration, int epicId) {
        super(id, summary, description, TaskType.SUBTASK, duration);
        this.epicId = epicId;
    }

    public int getEpicId() {
        return epicId;
    }

    public void setEpicId(int epicId) {
        this.epicId = epicId;
    }
}
