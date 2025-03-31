package com.example.demo.service;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    public Optional<Movie> findById(int id) {
        return movieRepository.findById(id);
    }

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    public void deleteById(int id) {
        movieRepository.deleteById(id);
    }

    public List<Movie> findByTitle(String title) {
        return movieRepository.findByTitle(title);
    }

}