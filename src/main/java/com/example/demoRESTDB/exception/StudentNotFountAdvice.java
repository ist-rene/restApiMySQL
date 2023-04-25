package com.example.demoRESTDB.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseStatus(HttpStatus.NOT_FOUND)
class StudentNotFountAdvice {

    String StudentNotFountAdvice(StudentNotFoundException exception) {
        return exception.getMessage();
    }
}
