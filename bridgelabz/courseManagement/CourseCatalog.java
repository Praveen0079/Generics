package com.bridgelabz.courseManagement;

import java.util.ArrayList;
import java.util.List;

public class CourseCatalog<T extends CourseType> {
    private List<Course<T>> courses = new ArrayList<>();

    public void addCourse(Course<T> course) {
        courses.add(course);
    }

    public void displayAllCourses() {
        System.out.println("\n----- Course Catalog ------");
        for(int i = 0; i < courses.size(); i++) {
            courses.get(i).displayCourse();
        }
    }

    // Wildcard method to display any type of courses
    public static void displayCourses(List<? extends CourseType> courses) {
        System.out.println("\n------ Displaying All Courses ------");
        for(int i = 0; i < courses.size(); i++) {
            courses.get(i).displayCourseDetails();
        }
    }
}
