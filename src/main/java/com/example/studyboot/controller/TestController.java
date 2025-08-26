package com.example.studyboot.controller;

import com.example.studyboot.domain.Test;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    private MyValidator myValidator;

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
            @RequestBody Test test,
            BindingResult bindingResult
            ) {
        myValidator.validate(test, bindingResult);

        if (bindingResult.hasErrors()) {
            throw new RuntimeException("error!!");
        }

        return "test3";
    }
}
