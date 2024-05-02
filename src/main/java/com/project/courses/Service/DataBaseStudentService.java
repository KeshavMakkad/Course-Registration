package com.project.courses.Service;

import com.project.courses.Models.Student;
import com.project.courses.Repositiries.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class DataBaseStudentService implements StudentService{
    StudentRepo studentRepo;

    DataBaseStudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public void registerNewStudent(Student student){
            studentRepo.save(student);
        }

    @Override
    public void deleteStudent(long id) {
        Student student = getStudentDetails(id);
        studentRepo.delete(student);
    }

    @Override
    public void addStudentToCourse() {
        // TODO implement here
    }

    @Override
    public void removeStudentFromCourse() {
        // TODO implement here
    }

    @Override
    public void getStudentCourses() {
        // TODO implement here
    }

    @Override
    public Student getStudentDetails(Long ID){
        Optional<Student> OptionalStudent = studentRepo.findById(ID);
        if(OptionalStudent.isPresent()){
            return OptionalStudent.get();
        }
        else throw new RuntimeException("Student not found");
    }

    @Override
    public void updateStudentDetails(Student student){
            studentRepo.save(student);
        }
}
