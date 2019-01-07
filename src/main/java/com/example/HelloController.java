package com.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloController {

    private TestConfig config;
    private ObjectMapper objectMapper;

    @Autowired
    public HelloController(TestConfig config, ObjectMapper objectMapper) {
        this.config = config;
        this.objectMapper = objectMapper;
    }

    @GetMapping
    public String helloGradle() throws JsonProcessingException {
        return objectMapper.writeValueAsString(config.getLst())
            + objectMapper.writeValueAsString(config.getA())
            + objectMapper.writeValueAsString(config.getDomains());
    }

}
