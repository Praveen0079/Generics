package com.bridgelabz.AIResumeScreening;

import java.util.List;
public class ResumeScreening {
    public static void main(String[] args) {
        // Create resumes for different job roles
        SoftwareEngineer softwareEngineer = new SoftwareEngineer("Ankush Sharma", 4, "Java, C++, MERN");
        DataScientist dataScientist = new DataScientist("Ansh", 3, "C, Javascript, SQL");
        ProductManager productManager = new ProductManager("Jashan", 1, "E-commerce, Business Development");

        // Processing resumes
        Resume<SoftwareEngineer> resumeSE = new Resume<>(softwareEngineer);
        Resume<DataScientist> resumeDS = new Resume<>(dataScientist);
        Resume<ProductManager> resumePM = new Resume<>(productManager);

        resumeSE.processResume();
        resumeDS.processResume();
        resumePM.processResume();

        // Screen multiple resumes using wildcard
        System.out.println("\n------ Screening Multiple Resumes ------");
        screenResumes(List.of(softwareEngineer, dataScientist, productManager));
    }

    // Wildcard method to screen resumes for any job role
    public static void screenResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            resume.displayResume();
        }
    }
}
