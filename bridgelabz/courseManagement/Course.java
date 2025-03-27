package com.bridgelabz.courseManagement;

public class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public void displayCourse() {
        courseType.displayCourseDetails();
    }

    public T getCourseType() {
        return courseType;
    }
}
