package com.example.brief_resourcium_optima_beta.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="employees")
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "user_name")
    private String user_name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "position")
    private int position;
    @Column(name = "date")
    private String date;

    public Employe(String name, String last_name, String user_name, String email, String password, int position, String date) {
        this.name = name;
        this.last_name = last_name;
        this.user_name = user_name;
        this.email = email;
        this.password = password;
        this.position = position;
        this.date = date;
    }

    public Employe() {

    }
}