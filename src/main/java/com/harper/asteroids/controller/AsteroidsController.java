package com.harper.asteroids.controller;

import com.harper.asteroids.model.AsteroidDetails;
import com.harper.asteroids.service.AsteroidsAnalyzerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
