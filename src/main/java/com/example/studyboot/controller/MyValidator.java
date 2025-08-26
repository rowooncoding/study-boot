package com.example.studyboot.controller;

import com.example.studyboot.domain.Test;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class MyValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(Test.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Test test = (Test) target;

        if (test.getSampleId() >= 50) {
            errors.rejectValue("sampleId", "ERROR");
        }
    }
}
