package com.codegym.pass_by_value;

public class ChangeValue {

    public static int changeValue(int x) {
        x = 10; // Thay đổi giá trị của x trong phương thức
        return x;
    }

    public static void main(String[] args) {
        int a = 5;
        int y = changeValue(a);
        System.out.println(a); // Output sẽ là 5, không bị thay đổi
        System.out.println(y); // 10
    }
}
