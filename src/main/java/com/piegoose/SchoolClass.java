package com.piegoose;

import java.util.ArrayList;

public class SchoolClass {

    private ArrayList<Student> students = new ArrayList<>();
    private Teacher supervisorTeacher;
    private String schoolClassName;

    public SchoolClass(String schoolClassName){
        this.schoolClassName=schoolClassName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }

    }

    public void setSchoolClassName(String schoolClassName) {
        this.schoolClassName=schoolClassName;
    }

    public String getSchoolClassName(){
        return schoolClassName;
    }

    public void assignTeacherClassSuoervisor(){
        
    }

}
