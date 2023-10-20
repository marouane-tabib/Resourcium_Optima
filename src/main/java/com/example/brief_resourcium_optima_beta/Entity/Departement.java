package com.example.brief_resourcium_optima_beta.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="departements")
public class Departement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "chef")
    private String chef;

    public Departement(String name, String description, String chef) {
        this.name = name;
        this.description = description;
        this.chef = chef;
    }

    public Departement() {

    }
}