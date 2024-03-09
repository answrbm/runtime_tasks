package classwork.projects.tasktracker.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Epic extends Task {

    private List<Subtask> subtasks;

    public Epic(int id, String title, String description) {
        super(id, title, description);
        this.subtasks = new ArrayList<>();
    }

    public List<Subtask> getSubtasks() {
        return subtasks;
    }

    public void addSubtasks(Subtask subtask) {
        subtasks.add(subtask);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Epic epic = (Epic) o;

        return Objects.equals(subtasks, epic.subtasks);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (subtasks != null ? subtasks.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Epic{" +
                "taskId=" + getTaskId() +
                ", summary='" + getSummary() +
                ", description='" + getDescription() +
                ", status=" + getStatus() +
                ", subtasks=" + subtasks +
                '}';
    }
}
