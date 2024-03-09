package classwork.projects.tasktracker.models;

import java.util.Objects;

public class Task {

    private int taskId;
    private String summary;
    private String description;
    private Status status;

    public Task(int taskId, String summary, String description) {
        this.taskId = taskId;
        this.summary = summary;
        this.description = description;
        this.status = Status.NEW;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (taskId != task.taskId) return false;
        if (!Objects.equals(summary, task.summary)) return false;
        if (!Objects.equals(description, task.description)) return false;
        return status == task.status;
    }

    @Override
    public int hashCode() {
        int result = taskId;
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", summary='" + summary + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
