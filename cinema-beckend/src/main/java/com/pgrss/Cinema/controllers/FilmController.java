package com.pgrss.Cinema.controllers;

import com.pgrss.Cinema.Repositories.Cinema.FilmsRepository;
import com.pgrss.Cinema.entities.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("film")
public class FilmController {

    @Autowired
    FilmsRepository filmsRepository;

    @GetMapping("/all")
    public List<Film> getAllFilms ()
    {
        return filmsRepository.findAll();
    }

    @GetMapping("/information")
    public Optional<Film> getFilmById(@RequestParam(required = false) Long id) {return filmsRepository.findFilmById(id);}


}
