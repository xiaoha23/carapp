package com.galvanize.carapp.repository;

import com.galvanize.carapp.model.RaceCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RaceCarRepository extends JpaRepository<RaceCar, UUID> {
}
