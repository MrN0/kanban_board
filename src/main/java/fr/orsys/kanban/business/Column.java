package fr.orsys.kanban.business;

import java.util.List;
import java.util.Objects;

public class Column {

    private Long id;
    private String name;
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
        Column column = (Column) o;
        return Objects.equals(id, column.id) &&
                Objects.equals(name, column.name) &&
                Objects.equals(tasks, column.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, tasks);
    }

    @Override
    public String toString() {
        return "Column{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tasks=" + tasks +
                '}';
    }

}
