package com.example.brief_resourcium_optima_beta.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "jetable")
    private String jetable;
    @Column(name = "start_date")
    private String start_date;
    @Column(name = "end_date")
    private String end_date;

    public Reservation(String name, String jetable, String start_date, String end_date) {
        this.name = name;
        this.jetable = jetable;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public Reservation() {

    }
}