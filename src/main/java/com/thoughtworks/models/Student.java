package com.thoughtworks.models;

public class Student {

    private int code;

    public Student(int code) {
        this.code = code;
    }

    public String sayCode()
    {
        if (code%3 == 0)
        {
            return "Fizz";
        }

        return String.valueOf(code);
    }
}
