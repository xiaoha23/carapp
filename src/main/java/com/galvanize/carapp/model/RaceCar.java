package com.galvanize.carapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RaceCar {
    @Id
    @GeneratedValue
    private UUID id;
    private String nickname;
    private String model;
    private String year;
    private String owner;
    private String status;
    private Integer topSpeed;
}
