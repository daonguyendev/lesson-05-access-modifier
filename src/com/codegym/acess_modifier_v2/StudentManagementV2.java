package com.codegym.acess_modifier_v2;

public class StudentManagementV2 {

    public static void main(String[] args) {
        StudentV2 sA = new StudentV2(1, "Tý");

        //'name' have private access -> error
        //System.out.println(sA.name);
    }
}
