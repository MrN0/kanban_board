package fr.orsys.kanban.business;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Project {

    private Long id;
    private String name;
    private String code;
    private LocalDateTime creationDateTime;
    private LocalDateTime deliveryDateTime;
    private Client client;
    private List<Task> tasks;
    private List<Developer> developers;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public LocalDateTime getDeliveryDateTime() {
        return deliveryDateTime;
    }

    public void setDeliveryDateTime(LocalDateTime deliveryDateTime) {
        this.deliveryDateTime = deliveryDateTime;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(id, project.id) &&
                Objects.equals(name, project.name) &&
                Objects.equals(code, project.code) &&
                Objects.equals(creationDateTime, project.creationDateTime) &&
                Objects.equals(deliveryDateTime, project.deliveryDateTime) &&
                Objects.equals(client, project.client) &&
                Objects.equals(tasks, project.tasks) &&
                Objects.equals(developers, project.developers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, code, creationDateTime, deliveryDateTime, client, tasks, developers);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", creationDateTime=" + creationDateTime +
                ", deliveryDateTime=" + deliveryDateTime +
                ", client=" + client +
                ", tasks=" + tasks +
                ", developers=" + developers +
                '}';
    }

}
