package com.codegym.access_modifier_v3;

import com.codegym.access_modifier_v2.StudentV2;

public class StudentManagementV3 {

    public static void main(String[] args) {
        StudentV2 studentV2 = new StudentV2(1, "Tý", 18);

        //access to age property of class when stay at another class
        //which it created at another package
//        System.out.println(studentV2.age);//error

        // public modifier: access properties, methods of classes
        // in the same package or different package is okay
        StudentV2 sB = new StudentV2(3, "Tồ", "0901234789");
        System.out.println(sB.phone);
    }
}
