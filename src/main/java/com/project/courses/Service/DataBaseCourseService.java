package com.project.courses.Service;


import com.project.courses.Models.Course;
import com.project.courses.Repositiries.CourseRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DataBaseCourseService implements com.project.courses.Service.CourseService {

    CourseRepo courseRepo;
    DataBaseCourseService(CourseRepo courseRepo){
        this.courseRepo = courseRepo;
    }

    @Override
    public void deleteCourse(long ID){

        Course course = getCourse(ID);
        courseRepo.delete(course);
    }

    @Override
    public void updateCourse(Course course){
        courseRepo.save(course);
    }

    @Override
    public Course getCourse(long ID){
        Optional<Course> OptionalCourse = courseRepo.findById(ID);
        if(OptionalCourse.isPresent()){
            return OptionalCourse.get();
        }
        else throw new RuntimeException("Course not found");
    }

    @Override
    public List<Course> getAllCourses(){
        List<Course> listOfCourses = courseRepo.findAll();
        return listOfCourses;
    }

    @Override
    public void addCourse(Course course) {
        courseRepo.save(course);
    }
}
