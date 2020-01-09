package com.thoughtworks.models;

public class Student {

    private int code;

    public Student(int code) {
        this.code = code;
    }

    public String sayCode()
    {
        if (code % 3 == 0)
        {
            return "Fizz";
        }

        if (code % 5 == 0)
        {
            return "Buzz";
        }

        if (code % 7 == 0)
        {
            return "Whizz";
        }

        return String.valueOf(code);
    }
}
