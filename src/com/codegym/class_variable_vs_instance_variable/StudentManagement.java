package com.codegym.class_variable_vs_instance_variable;

public class StudentManagement {

    public static void main(String[] args) {
        // Access Class variable
        System.out.println(Student.CENTER_NAME);

        // Access Instance variable
        Student s1 = new Student(1, "Khang");
        Student s2 = new Student(2, "Tân");
        Student s3 = new Student(3, "Hoàng");
        Student s4 = new Student(4, "Trung");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
