package com.project.courses.Service;



import com.project.courses.Models.Course;

import java.util.List;

public interface CourseService {

    void deleteCourse(long ID);

    void updateCourse(Course course);

    Course getCourse(long ID);

    List<Course> getAllCourses();

    void addCourse(Course course);
}
