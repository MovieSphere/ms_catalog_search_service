package com.upao.infraestructura.ms_catalog_search_service.controllers;

import com.upao.infraestructura.ms_catalog_search_service.models.Catalogo;
import com.upao.infraestructura.ms_catalog_search_service.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/catalogos")
public class MoviesController {
    @GetMapping
    public Catalogo getAllMovies() {
        Movie movie = new Movie(1,"Titanic", "https://example.com/titanic.jpg");
        List<Movie> movies = new ArrayList<>();
        movies.add(movie);
        return new Catalogo(1,"Catalogo 1", movies);
    }
}
