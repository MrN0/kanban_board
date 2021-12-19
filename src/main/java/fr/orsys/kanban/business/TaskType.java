package fr.orsys.kanban.business;

import java.util.List;
import java.util.Objects;

public class TaskType {

    private Long id;
    private String name;
    private String color;
    private String description;
    private List<Task> tasks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskType taskType = (TaskType) o;
        return Objects.equals(id, taskType.id) &&
                Objects.equals(name, taskType.name) &&
                Objects.equals(color, taskType.color) &&
                Objects.equals(description, taskType.description) &&
                Objects.equals(tasks, taskType.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color, description, tasks);
    }

    @Override
    public String toString() {
        return "TaskType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", description='" + description + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
