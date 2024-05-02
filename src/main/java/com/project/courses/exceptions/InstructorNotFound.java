package com.project.courses.exceptions;

import lombok.Getter;

@Getter
public class InstructorNotFound extends RuntimeException{

    private final Long id;
    public InstructorNotFound(Long id, String message){
        super(message);
        this.id = id;
    }
}
