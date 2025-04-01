package com.piegoose;

import com.piegoose.*;

import java.util.ArrayList;

// todo dodac biblioteke faker / random ktora generuje uzytkownikow
// todo kazda klasa ma wychodchowawce (ClassSupervisor)
public class Main {
    public static void main(String[] args) {

        ArrayList<Person> users = new ArrayList<>();
        Student student = new Student("Jedrzej", 16, 5);
        Student student2 = new Student("Marek", 16, 3);
        Teacher teacher = new Teacher("Tomasz", 50, "Matematyka");
        SchoolClass schoolClass = new SchoolClass("Klasa A");
        SchoolClassDatabase schoolClassDatabase = new SchoolClassDatabase();
        // dodanie obiektow
        users.add(student);
        users.add(student2);
        users.add(teacher);



        schoolClass.addStudent(student);
        schoolClass.addStudent(student2);
        schoolClass.displayStudents();
        schoolClassDatabase.addSchoolClassToDatabase(schoolClass);
        schoolClassDatabase.removeSchoolClass(schoolClass.getSchoolClassName());
        schoolClassDatabase.removeSchoolClass(schoolClass.getSchoolClassName());
        schoolClass.displayStudents();



    }


}
















////        Student student = new Student();
//        Class class1 = new Class();
//        Teacher teacher = new Teacher();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println();
//        System.out.println(" ---- WITAJ W ELEKTROCZNICZNYM DZIENNNIKU --- ");
//        System.out.println("");
//        boolean running = true;
//        while (running) {
//            MenuLauncher.menuLaunch();
//////            Student instantStudent = new Student("Jedrzej Sikora", 4);
////            class1.setStudentsList(instantStudent);
////            Teacher instantTeacher = new Teacher("Angielski",30,"Marek Mostowiak");
////            teacher.setTeacher(instantTeacher);
//
//            switch (scanner.nextInt()) {
////                case 1 -> System.out.println(class1.getStudentsList()); ///
////                case 2 -> class1.studentAddToList(scanner);  ///
////                case 3 -> class1.studentRemoveFromList(scanner);
////                case 4 -> teacher.addTeacher(scanner);
////                case 5 -> teacher.removeTeacher(scanner);
////                case 6 -> System.out.println(teacher.getTeacherList());
////                case 7 -> {
////                    class1.createClass(); /// dziala
////                    class1.assignStudentToClass();
////                }
////                case 8 -> class1.classDisplay();// wypisanie klas
////                case 9 -> {
////                    running = false;
////                    System.out.println("Zamykanie ..");
////
////                }}
//}

