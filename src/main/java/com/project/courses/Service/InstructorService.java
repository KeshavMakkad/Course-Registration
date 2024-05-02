package com.project.courses.Service;

import com.project.courses.Models.Instructor;

public interface InstructorService {
    public void registerNewInstructor(Instructor instructor);

    public void deleteInstructor(long ID);

    public void updateInstructorDetails(Instructor instructor);

    public Instructor getInstructorDetails(long ID);
}
