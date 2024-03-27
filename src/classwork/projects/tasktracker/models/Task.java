package classwork.projects.tasktracker.models;

import classwork.projects.tasktracker.util.Status;
import classwork.projects.tasktracker.util.TaskType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Task {

    private int taskId;
    private String summary;
    private String description;
    private Status status;
    private LocalDateTime createdAt;
    private LocalDateTime finishedAt;
    private TaskType taskType;

    private int duration = 9;

    public Task(int taskId, String summary, String description, TaskType taskType, int duration) {
        this.taskId = taskId;
        this.summary = summary;
        this.description = description;
        this.status = Status.NEW;
        this.createdAt = LocalDateTime.now();
        this.duration = duration;
        this.finishedAt = this.createdAt.plusDays(duration);
        this.taskType = taskType;
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

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(LocalDateTime finishedAt) {
        this.finishedAt = finishedAt;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
