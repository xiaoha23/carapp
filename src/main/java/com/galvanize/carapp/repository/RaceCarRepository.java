package com.galvanize.carapp.repository;

import com.galvanize.carapp.model.RaceCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceCarRepository extends JpaRepository<RaceCar, Long> {
}
