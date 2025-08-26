package com.example.studyboot.domain;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Test {

    @NotBlank
    private final String description;

    @Min(10)
    @Max(50)
    private final Integer sampleId;

    public Test(String description, Integer sampleId) {
        this.description = description;
        this.sampleId = sampleId;
    }
}
