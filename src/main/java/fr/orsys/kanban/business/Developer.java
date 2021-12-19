package fr.orsys.kanban.business;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Developer {

    private Long id;
    private String firstNam;
    private String lastName;
    private String email;
    private LocalDate birthDate;
    private List<Task> tasks;
    private List<Project> projects;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstNam() {
        return firstNam;
    }

    public void setFirstNam(String firstNam) {
        this.firstNam = firstNam;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return Objects.equals(id, developer.id) &&
                Objects.equals(firstNam, developer.firstNam) &&
                Objects.equals(lastName, developer.lastName) &&
                Objects.equals(email, developer.email) &&
                Objects.equals(birthDate, developer.birthDate) &&
                Objects.equals(tasks, developer.tasks) &&
                Objects.equals(projects, developer.projects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstNam, lastName, email, birthDate, tasks, projects);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", firstNam='" + firstNam + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", tasks=" + tasks +
                ", projects=" + projects +
                '}';
    }
}
