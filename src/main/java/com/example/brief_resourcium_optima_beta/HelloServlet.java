package com.example.brief_resourcium_optima_beta;

import java.io.*;

import com.example.brief_resourcium_optima_beta.Entity.Employe;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    private EntityManagerFactory entityManagerFactory = null;
    private EntityManager entityManager = null;

    public void init() {
        message = "Hello World!";
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Employe employe = new Employe("maroune", "12345678", "Marouane", "Tabib", "and@gmail.com", 1, "2022-32-44");
        entityManager.getTransaction().begin();
        entityManager.persist(employe);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    public void destroy() {
    }

}