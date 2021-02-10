package com.galvanize.carapp.service;

import com.galvanize.carapp.model.RaceCar;
import com.galvanize.carapp.repository.RaceCarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RaceCarService {

    private RaceCarRepository raceCarRepository;

    public RaceCar createRaceCar(RaceCar raceCar) {
        return raceCarRepository.save(raceCar);
    }
}
