package com.bridgelabz.AIResumeScreening;

//Abstract class to define job role
public abstract class JobRole {
    private String candidateName;
    private int experienceYears;

    public JobRole(String candidateName, int experienceYears) {
        this.candidateName = candidateName;
        this.experienceYears = experienceYears;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public abstract void displayResume();
}


//Different job profiles
class SoftwareEngineer extends JobRole {
    private String programmingLanguages;

    public SoftwareEngineer(String candidateName, int experienceYears, String programmingLanguages) {
        super(candidateName, experienceYears);
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public void displayResume() {
        System.out.println("Software Engineer Resume");
        System.out.println("Candidate: " + getCandidateName());
        System.out.println("Experience: " + getExperienceYears() + " years");
        System.out.println("Skills: " + programmingLanguages);
        System.out.println("--------------------------------");
    }
}


class DataScientist extends JobRole {
    private String dataTools;

    public DataScientist(String candidateName, int experienceYears, String dataTools) {
        super(candidateName, experienceYears);
        this.dataTools = dataTools;
    }

    @Override
    public void displayResume() {
        System.out.println("Data Scientist Resume");
        System.out.println("Candidate: " + getCandidateName());
        System.out.println("Experience: " + getExperienceYears() + " years");
        System.out.println("Data Tools: " + dataTools);
        System.out.println("--------------------------------");
    }
}



class ProductManager extends JobRole {
    private String domainExpertise;

    public ProductManager(String candidateName, int experienceYears, String domainExpertise) {
        super(candidateName, experienceYears);
        this.domainExpertise = domainExpertise;
    }

    @Override
    public void displayResume() {
        System.out.println("Product Manager Resume");
        System.out.println("Candidate: " + getCandidateName());
        System.out.println("Experience: " + getExperienceYears() + " years");
        System.out.println("Domain Expertise: " + domainExpertise);
        System.out.println("-------------------------------");
    }
}
