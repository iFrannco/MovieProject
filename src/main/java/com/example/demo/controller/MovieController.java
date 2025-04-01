package com.example.demo.controller;

import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> findAll() {
        return movieService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Movie> findById(@PathVariable int id) {
        return movieService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED) // 201
    @PostMapping
    public Movie create(@RequestBody Movie movie) {
        return movieService.save(movie);
    }

    @PutMapping
    public Movie update(@RequestBody Movie movie) {
        return movieService.save(movie);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        movieService.deleteById(id);
    }

    @GetMapping("/find/title/{title}")
    public List<Movie> findByTitle(@PathVariable String title) {
        return movieService.findByTitle(title);
    }

}