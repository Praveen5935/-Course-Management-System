package com.entity;
public class Course {
    private String candidateName;
    private String category;
    private String courseName;
    private int duration;
    private double price;

    // Constructor
    public Course(String candidateName, String category, String courseName, int duration, double price) {
        this.candidateName = candidateName;
        this.category = category;
        this.courseName = courseName;
        this.duration = duration;
        this.price = price;
    }

    // Getters and Setters
    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
