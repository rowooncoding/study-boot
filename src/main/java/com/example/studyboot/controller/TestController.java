package com.example.studyboot.controller;

import com.example.studyboot.domain.Test;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @GetMapping("/api/v1/test/{testId}")
    public String getTest(@PathVariable Integer testId) {
        return "testId";
    }

    @GetMapping("/api/v1/test/{testId}")
    public String getTest2(@PathVariable Integer testId, @RequestParam String name) {
        return "testId2";
    }

    @PostMapping("/api/v1/test/{testId}")
    public String getTest3(
            @PathVariable Integer testId,
            @RequestParam String name,
            @RequestBody Test test
            ) {
        return "test3";
    }
}
