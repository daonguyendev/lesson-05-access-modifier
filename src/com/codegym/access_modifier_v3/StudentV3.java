package com.codegym.access_modifier_v3;

import com.codegym.access_modifier_v2.StudentV2;

public class StudentV3 extends StudentV2 {
    public StudentV3(int id, String name, int age, String account) {
        super(id, name, age, account);
    }

    public static void main(String[] args) {
        StudentV3 studentV3 = new StudentV3(2, "Tèo", 19, "codegym");
        System.out.println(studentV3.account);//"codegym"
    }
}
