package com.project.courses.Service;

import com.project.courses.Models.Instructor;
import com.project.courses.Repositiries.InstructorRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DataBaseInstructorService implements InstructorService{

    InstructorRepo instructorRepo;
    DataBaseInstructorService(InstructorRepo instructorRepo){
        this.instructorRepo = instructorRepo;
    }

    @Override
    public void registerNewInstructor(Instructor instructor) {
        instructorRepo.save(instructor);
    }

    @Override
    public void deleteInstructor(long ID) {
        Instructor instructor = getInstructorDetails(ID);
        instructorRepo.delete(instructor);
    }

    @Override
    public void updateInstructorDetails(Instructor instructor) {
        instructorRepo.save(instructor);
    }

    @Override
    public Instructor getInstructorDetails(long ID) {
        Optional<Instructor> OptionalInstructor = instructorRepo.findById(ID);
        if(OptionalInstructor.isPresent()){
            return OptionalInstructor.get();
        }
        else throw new RuntimeException("Instructor not found");
    }
}
