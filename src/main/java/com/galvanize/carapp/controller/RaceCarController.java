package com.galvanize.carapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/racecar")
public class RaceCarController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createRaceCar(){

    }
}
