package com.bridgelabz.courseManagement;

public abstract class CourseType {
    protected String courseName;
    protected String instructor;

    public CourseType(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public abstract void displayCourseDetails();
}


class ExamCourse extends CourseType {
    private int examWeightage;

    public ExamCourse(String courseName, String instructor, int examWeightage) {
        super(courseName, instructor);
        this.examWeightage = examWeightage;
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Exam-Based Course: " + courseName + " | Instructor: " + instructor + " | Exam Weightage: " + examWeightage + "%");
    }
}


class AssignmentCourse extends CourseType {
    private int totalAssignments;

    public AssignmentCourse(String courseName, String instructor, int totalAssignments) {
        super(courseName, instructor);
        this.totalAssignments = totalAssignments;
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Assignment-Based Course: " + courseName + " | Instructor: " + instructor + " | Total Assignments: " + totalAssignments);
    }
}


class ResearchCourse extends CourseType {
    private String researchTopic;

    public ResearchCourse(String courseName, String instructor, String researchTopic) {
        super(courseName, instructor);
        this.researchTopic = researchTopic;
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Research-Based Course: " + courseName + " | Instructor: " + instructor + " | Research Topic: " + researchTopic);
    }
}
