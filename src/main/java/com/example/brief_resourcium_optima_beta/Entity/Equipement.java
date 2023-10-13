package com.example.brief_resourcium_optima_beta.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="departements")
public class Equipement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private String type;
    @Column(name = "buying_date")
    private String buying_date;
    @Column(name = "main_date")
    private String main_date;

    public Equipement(String name, String type, String buying_date, String main_date) {
        this.name = name;
        this.type = type;
        this.buying_date = buying_date;
        this.main_date = main_date;
    }

    public Equipement() {

    }
}