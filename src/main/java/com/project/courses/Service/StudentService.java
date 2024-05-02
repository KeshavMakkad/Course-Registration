package com.project.courses.Service;

import com.project.courses.Models.Student;
import com.project.courses.Repositiries.StudentRepo;

public interface StudentService {
//    private void

    public void registerNewStudent(Student student);

    public void deleteStudent(long ID);

    public void addStudentToCourse();

    public void removeStudentFromCourse();

    public void getStudentCourses();

    public Student getStudentDetails(Long ID);

    public void updateStudentDetails(Student student);
}
