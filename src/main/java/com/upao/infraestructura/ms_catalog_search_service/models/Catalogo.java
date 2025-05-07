package com.upao.infraestructura.ms_catalog_search_service.models;

import java.util.List;

public class Catalogo {
    private int id;
    private String name;
    private List<Movie> movies;

    public Catalogo() {
    }

    public Catalogo(int id, String name, List<Movie> movies) {
        this.id = id;
        this.name = name;
        this.movies = movies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}

