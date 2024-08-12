package com.codegym.pass_by_reference;

public class StudentManagement {

    public static void main(String[] args) {
        Student sA = new Student(1, "Tý");
        Student sB = sA;
        System.out.println(sA);
        System.out.println(sB);

        sA.setName("Tèo");
        System.out.println(sA);
        System.out.println(sB);
    }
}
