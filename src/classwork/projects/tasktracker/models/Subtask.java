package classwork.projects.tasktracker.models;

import java.util.Objects;

public class Subtask extends Task {

    private Epic epic;

    public Subtask(int id, String summary, String description, Epic epic) {
        super(id, summary, description);
        this.epic = epic;
    }

    public Epic getEpic() {
        return epic;
    }

    public void setEpic(Epic epic) {
        this.epic = epic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Subtask subtask = (Subtask) o;

        return Objects.equals(epic, subtask.epic);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (epic != null ? epic.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Subtask{" +
                "taskId=" + getTaskId() +
                ", summary='" + getSummary() +
                ", description='" + getDescription() +
                ", status=" + getStatus() +
                '}';
    }
}
