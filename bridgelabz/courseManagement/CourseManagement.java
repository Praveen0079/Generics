package com.bridgelabz.courseManagement;

import java.util.ArrayList;
import java.util.List;

public class CourseManagement {
    public static void main(String[] args) {
        // Create different courses
        ExamCourse mathExam = new ExamCourse("Mathematics", "Dr. Smith", 70);
        AssignmentCourse historyAssignment = new AssignmentCourse("History", "Prof. Johnson", 5);
        ResearchCourse physicsResearch = new ResearchCourse("Physics", "Dr. Brown", "Quantum Mechanics");

        // Create generic course objects
        Course<ExamCourse> course1 = new Course<>(mathExam);
        Course<AssignmentCourse> course2 = new Course<>(historyAssignment);
        Course<ResearchCourse> course3 = new Course<>(physicsResearch);

        // Create Course Catalogs
        CourseCatalog<ExamCourse> examCatalog = new CourseCatalog<>();
        CourseCatalog<AssignmentCourse> assignmentCatalog = new CourseCatalog<>();
        CourseCatalog<ResearchCourse> researchCatalog = new CourseCatalog<>();

        // Add courses to catalogs
        examCatalog.addCourse(course1);
        assignmentCatalog.addCourse(course2);
        researchCatalog.addCourse(course3);

        // Display catalogs
        examCatalog.displayAllCourses();
        assignmentCatalog.displayAllCourses();
        researchCatalog.displayAllCourses();

        // Use wildcard method to display all courses
        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(mathExam);
        allCourses.add(historyAssignment);
        allCourses.add(physicsResearch);

        CourseCatalog.displayCourses(allCourses);
    }
}
