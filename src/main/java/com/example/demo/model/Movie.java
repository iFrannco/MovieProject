package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;

    // for JPA only, no use
    public Movie() {
    }

    public Movie(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", titulo='" + this.title + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}