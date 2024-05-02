package com.project.courses.exceptions;

import lombok.Getter;

@Getter

public class BadRequest extends RuntimeException{
    public BadRequest(String message) {
        super(message);
    }
}