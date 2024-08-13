package com.codegym.access_modifier_v2;

public class StudentManagementV2 {

    public static void main(String[] args) {
        StudentV2 sA = new StudentV2(1, "Tý", 18);

        // private modifier: access properties, methods in class
        //'name' have private access -> error
//        System.out.println(sA.name);

        // default modifier: access properties, methods of classes
        // in the same package
        System.out.println(sA.age);

        // public modifier: access properties, methods of classes
        // in the same package or different package is okay
        StudentV2 sB = new StudentV2(2, "Tèo", "0901234567");
        System.out.println(sB.phone);
    }
}
