package com.example.brief_resourcium_optima_beta;


import com.example.brief_resourcium_optima_beta.Entity.Equipement;
import com.example.brief_resourcium_optima_beta.Entity.Reservation;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "reservations", value = "/reservations")
public class Reservations extends HttpServlet {
    private String message;
    private EntityManagerFactory entityManagerFactory = null;
    private EntityManager entityManager = null;

    public void init() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Reservation reservation = new Reservation("Tool 1", "Jetable", "20.0/22/22", "20.0/34/32");
        entityManager.getTransaction().begin();
        entityManager.persist(reservation);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    public void destroy() {
    }

}