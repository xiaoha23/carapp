package com.galvanize.carapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "car_id_seq", sequenceName = "car_id_seq", allocationSize = 1)
public class RaceCar {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "car_id_seq")
    private Long id;
    private String nickname;
    private String model;
    private String year;
    private String owner;
    private String status;
    private Integer topSpeed;
}
