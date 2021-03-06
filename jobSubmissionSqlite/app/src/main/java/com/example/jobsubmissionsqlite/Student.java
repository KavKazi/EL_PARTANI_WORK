package com.example.jobsubmissionsqlite;

public class Student {
    private String firstName,lastName,numClass;
    private int avgGrade;

    public Student(String firstName, String lastName, String numClass, int avgGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numClass = numClass;
        this.avgGrade = avgGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumClass() {
        return numClass;
    }

    public void setNumClass(String numClass) {
        this.numClass = numClass;
    }

    public int getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(int avgGrade) {
        this.avgGrade = avgGrade;
    }
}
