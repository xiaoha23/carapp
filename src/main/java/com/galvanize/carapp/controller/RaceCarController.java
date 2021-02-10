package com.galvanize.carapp.controller;

import com.galvanize.carapp.model.RaceCar;
import com.galvanize.carapp.service.RaceCarService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/racecar")
@AllArgsConstructor
public class RaceCarController {

    private RaceCarService raceCarService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RaceCar createRaceCar(@RequestBody RaceCar raceCar){

        return raceCarService.createRaceCar(raceCar);
    }

    @GetMapping
    public List<RaceCar> getAllRaceCar(){
        return raceCarService.getAllRaceCar();
    }
}
