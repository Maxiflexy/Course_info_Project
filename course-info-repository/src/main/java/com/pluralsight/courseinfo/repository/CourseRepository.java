package com.pluralsight.courseinfo.repository;

import com.pluralsight.courseinfo.domain.Course;

import java.util.List;

public interface CourseRepository {
    void saveCourse(Course course);

    List<Course> getAllcourses();

    void addNotes(String id, String notes);

    static CourseRepository openCourseRepository(String databaseFile){
        return new CourseJdbcRepository(databaseFile);

    }
}
