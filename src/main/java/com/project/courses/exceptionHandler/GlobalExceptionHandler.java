package com.project.courses.exceptionHandler;

import com.project.courses.DTO.ExceptionDTO;
import com.project.courses.exceptions.BadRequest;
import com.project.courses.exceptions.CourseNotFound;
import com.project.courses.exceptions.InstructorNotFound;
import com.project.courses.exceptions.StudentNotFound;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(CourseNotFound.class)
    public ResponseEntity<ExceptionDTO> handleCourseNotFoundException(CourseNotFound courseNotFound) {
        ExceptionDTO exceptionDto = new ExceptionDTO();
        exceptionDto.setMessage("Course Id " + courseNotFound.getId() + " is Invalid");
        exceptionDto.setResolution("Provide valid Course id");
        return ResponseEntity.status(400).body(exceptionDto);
    }

    @ExceptionHandler(BadRequest.class)
    public ResponseEntity<ExceptionDTO> BadRequest() {
        ExceptionDTO exceptionDto = new ExceptionDTO();
        exceptionDto.setMessage(" Bad Request Exception");
        exceptionDto.setResolution("Fix and Try Again.");
        return ResponseEntity.status(400).body(exceptionDto);
    }

    @ExceptionHandler(StudentNotFound.class)
    public ResponseEntity<ExceptionDTO> handleStudentNotFoundException(StudentNotFound studentNotFoundException) {
        ExceptionDTO exceptionDto = new ExceptionDTO();
        exceptionDto.setMessage("Student Id " + studentNotFoundException.getId() + " is Invalid");
        exceptionDto.setResolution("Provide valid Course id");
        return ResponseEntity.status(400).body(exceptionDto);
    }

    @ExceptionHandler(InstructorNotFound.class)
    public ResponseEntity<ExceptionDTO> handleInstructorNotFoundException(InstructorNotFound instructorNotFoundException) {
        ExceptionDTO exceptionDTO = new ExceptionDTO();
        exceptionDTO.setMessage("Instructor Id " + instructorNotFoundException.getId() + " is Invalid");
        exceptionDTO.setResolution("Provide valid Instructor id");
        return ResponseEntity.status(400).body(exceptionDTO);
    }
}