package com.asteroids.controller;

import com.asteroids.service.AsteroidsAnalyzerService;
import com.asteroids.model.AsteroidDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class AsteroidsController {

    @Autowired
    private AsteroidsAnalyzerService asteroidsAnalyzerService;

    @GetMapping("/asteroids")
    public List<AsteroidDetails> getAsteroidDetails(){
        return asteroidsAnalyzerService.findAsteroids();
    }
}
