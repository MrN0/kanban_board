package fr.orsys.kanban.business;

import java.time.LocalDateTime;
import java.util.Objects;

public class Task {

    private Long id;
    private String entitled;
    private LocalDateTime creationDateTime;
    private int hoursSpent;
    private int hoursScheduled;
    private Project project;
    private TaskType taskType;
    private Column column;
    private Developer developer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntitled() {
        return entitled;
    }

    public void setEntitled(String entitled) {
        this.entitled = entitled;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public int getHoursSpent() {
        return hoursSpent;
    }

    public void setHoursSpent(int hoursSpent) {
        this.hoursSpent = hoursSpent;
    }

    public int getHoursScheduled() {
        return hoursScheduled;
    }

    public void setHoursScheduled(int hoursScheduled) {
        this.hoursScheduled = hoursScheduled;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public Column getColumn() {
        return column;
    }

    public void setColumn(Column column) {
        this.column = column;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return hoursSpent == task.hoursSpent &&
                hoursScheduled == task.hoursScheduled &&
                Objects.equals(id, task.id) &&
                Objects.equals(entitled, task.entitled) &&
                Objects.equals(creationDateTime, task.creationDateTime) &&
                Objects.equals(project, task.project) &&
                Objects.equals(taskType, task.taskType) &&
                Objects.equals(column, task.column) &&
                Objects.equals(developer, task.developer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, entitled, creationDateTime, hoursSpent, hoursScheduled, project, taskType, column, developer);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", entitled='" + entitled + '\'' +
                ", creationDateTime=" + creationDateTime +
                ", hoursSpent=" + hoursSpent +
                ", hoursScheduled=" + hoursScheduled +
                ", project=" + project +
                ", taskType=" + taskType +
                ", column=" + column +
                ", developer=" + developer +
                '}';
    }

}
