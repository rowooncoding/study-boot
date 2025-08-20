package com.example.studyboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class TestConfig {

    @Bean
    @Primary
    public Service testService() {
        return new TestService();
    }

    @Bean
    public Service sampleService() {
        return new SampleService();
    }
}
