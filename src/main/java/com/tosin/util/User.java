package com.tosin.util;

public class User {
    String nameOfStaff;
    String roleOfStaff;
    int ageOfStaff;

    public User(String name, String role, int age) {
        nameOfStaff = name;
        roleOfStaff = role;
        ageOfStaff = age;
    }

    public String getStaffName() {
        return this.nameOfStaff;
    }

    public String getRole() {
        return this.roleOfStaff;
    }

    public int getAge() {
        return this.ageOfStaff;
    }

}
