package com.codegym.class_method_vs_instance_method;

public class StudentC06Management {

    public static void main(String[] args) {
        // Access Class Method
        StudentC06[] studentsC06 = StudentC06.getStudentC06List();//Class Method
        for (StudentC06 s06: studentsC06) {
            System.out.println(s06);
        }

        // Access Instance method
        StudentC06 firstStudentC06 = new StudentC06(1, "Khang");
        System.out.println(firstStudentC06.getName()); //Instance Method
    }
}
