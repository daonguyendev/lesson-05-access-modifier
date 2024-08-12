package com.codegym.access_modifier;

public class FrontendInstructor {

    public static void main(String[] args) {
        System.out.println(Instructor.getAddress());

        Instructor feInstructor = new Instructor(2, "Ân", "FullBugs", "21K NVT123");
        System.out.println(feInstructor.getAddress2());
    }
}
