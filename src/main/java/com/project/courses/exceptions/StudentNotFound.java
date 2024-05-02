package com.project.courses.exceptions;

import lombok.Getter;

@Getter
public class StudentNotFound extends RuntimeException{
    private final Long id;
    public StudentNotFound(Long id , String message){
        super(message);
        this.id = id;
    }
}