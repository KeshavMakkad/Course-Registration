package com.project.courses.exceptions;

import lombok.Getter;

@Getter

public class CourseNotFound extends RuntimeException {
    private final Long id;
    public CourseNotFound(Long id, String message){
        super(message);
        this.id = id;
    }

}