package com.example.studyboot;

// 자바 기반으로 빈 생성
public class TestService implements Service {

    @Override
    public String getTest() {
        return "test";
    }
}
