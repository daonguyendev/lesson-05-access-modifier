package com.codegym.static_keyword;

public class StudentManagement {

    public static void main(String[] args) {
        String centerName = Student.CENTER_NAME;
        System.out.println("Welcome to " + centerName);
        Student.greeting();
    }
}
