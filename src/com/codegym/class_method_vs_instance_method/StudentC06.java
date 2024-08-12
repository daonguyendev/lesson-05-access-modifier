package com.codegym.class_method_vs_instance_method;

public class StudentC06 {

    //Class Variable (using static keyword)
    public static final String CENTER_NAME = "CodeGym";

    //Class Method (using static keyword)
    public static StudentC06[] getStudentC06List() {
        StudentC06[] studentC06s = new StudentC06[4];
        studentC06s[0] = new StudentC06(1, "Khang");
        studentC06s[1] = new StudentC06(2, "Tân");
        studentC06s[2] = new StudentC06(3, "Hoàng");
        studentC06s[3] = new StudentC06(4, "Trung");
        return studentC06s;
    }

    private int id;

    //Instance Variable (not using static keyword)
    private String name;

    public StudentC06(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Instance Method (not using static keyword)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
