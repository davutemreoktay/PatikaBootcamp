package com.patikaDev.Model;

public class Student extends User{
    public Student() {
    }

    public Student(int id, String name, String username, String password, String type) {
        super(id, name, username, password, type);
    }
}