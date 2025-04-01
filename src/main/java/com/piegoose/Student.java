package com.piegoose;

import com.github.javafaker.Faker;

public class Student extends Person {
    private double grade;

    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }


    public double getGrade() {
        return grade;
    }



    @Override
    public void displayInfo() {
        System.out.println("Student name: " + getName() + ", Age: " + getAge() + ", Grade: " + grade);
    }

    @Override
    public String toString() {
        return super.toString() + " " + grade;
    }


}


//    // pola:
//    private String name;
//    private int id;
//    private double grade;
//
//
//    //konstruktor
//    public Student(String name, double grade) {
//        this.name = name;
//        this.id = id;
//        this.grade = grade;
//
//    }
//
//    public Student() {
//
//    }
//
//    // 3 - gettery i settery (+metody)
//    public String getName() {
//        return name;
//    }
//
//    public void displayStudentInfo(Student student) {
//        System.out.println("Imie studenta: " + name);
//        System.out.println("Indeks studenta: " + id);
//        System.out.println("Ocena koncowa studenta: " + grade);
//
//
//    }
//
//    @Override
//    public String toString() {
//
//        return name + grade;
//    }

