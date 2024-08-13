package com.codegym.access_modifier_v2;

public class StudentV2 {
    private int id;
    private String name;
    int age;
    protected String account;
    public String phone;

    public StudentV2(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public StudentV2(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public StudentV2(int id, String name, int age, String account) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.account = account;
    }

    public StudentV2(int id, String name, int age, String account, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.account = account;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "StudentV2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", account='" + account + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
