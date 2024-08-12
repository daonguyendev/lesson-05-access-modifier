package com.codegym.access_modifier;

public class Instructor {
    private int id;
    private static String name = "Đạo";
    static String skills = "FullBugs";//default level
    protected static String address = "21K Nguyen Van Troi";//protected level

    protected String address2 = "21K Sala";//protected level

    public static int experience = 5;//public level

    public Instructor(int id, String name, String skills, String address2) {
        this.id = id;
        this.name = name;
        this.skills = skills;
        this.address2 = address2;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public static String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        System.out.println(Instructor.name);
        System.out.println(Instructor.skills);
        System.out.println(Instructor.experience);
    }
}
