package com.thoughtworks.models;

public class Student {

    private int code;

    public Student(int code) {
        this.code = code;
    }

    public int sayCode() {
        return code;
    }
}
