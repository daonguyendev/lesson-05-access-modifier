package com.codegym.pass_by_value;

public class PassByValue {
    public static void main(String[] args) {
        int a = 3;
        int b = a;
        System.out.println(a);//3
        System.out.println(b);//3

        a = 5;
        System.out.println(a);//5
        System.out.println(b);//3

        b = 7;
        System.out.println(a);//5
        System.out.println(b);//7
    }
}
