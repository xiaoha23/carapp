package com.galvanize.carapp.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.galvanize.carapp.model.RaceCar;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class RaceCarControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper mapper;

    @Test
    public void test_postCar_return201() throws Exception
    {
        RaceCar raceCar = RaceCar.builder()
                .nickname("nick name")
                .year("2021")
                .model("Ferrari")
                .status("Available")
                .owner("owner")
                .topSpeed(198)
                .build();

        mockMvc.perform(post("/api/v1/racecar")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(raceCar)))
        .andExpect(status().isCreated())
        .andExpect(jsonPath("$.id").exists())
        .andExpect(jsonPath("$.nickname").value("nick name"))
        .andExpect(jsonPath("$.year").value("2021"))
        .andExpect(jsonPath("$.model").value("Ferrari"))
        .andExpect(jsonPath("$.status").value("Available"))
        .andExpect(jsonPath("$.owner").value("owner"))
        .andExpect(jsonPath("$.topSpeed").value(198));

    }
}
