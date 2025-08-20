package com.example.studyboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/api/v1/test")
    public String test() {
        return testService.getTest();
    }
}
