package com.example.studyboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final TestService testService;

    // 생성자 주입
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/api/v1/test")
    public String test() {
        return testService.getTest();
    }
}
