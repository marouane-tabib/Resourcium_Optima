package com.example.brief_resourcium_optima_beta.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "limit_date")
    private String limit_date;

    @Column(name = "priority")
    private String priority;

    @Column(name = "employee")
    private String employee;

    @Column(name = "status")
    private String status;

    public Task(int id, String name, String description, String limit_date, String priority, String employee, String status) {
        this.name = name;
        this.description = description;
        this.limit_date = limit_date;
        this.priority = priority;
        this.employee = employee;
        this.status = status;
    }
    public Task() {

    }
}