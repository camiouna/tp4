package com.iset.tp4.entities;

import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String jobOffer;

    public Employee() {}

    public Employee(String name, String email, String jobOffer) {
        this.name = name;
        this.email = email;
        this.jobOffer = jobOffer;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getJobOffer() {
        return jobOffer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJobOffer(String jobOffer) {
        this.jobOffer = jobOffer;
    }
}