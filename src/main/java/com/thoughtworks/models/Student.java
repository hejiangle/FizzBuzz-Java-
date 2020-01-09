package com.thoughtworks.models;

import com.thoughtworks.utils.CodeChecker;

public class Student {

    private int code;

    public Student(int code) {
        this.code = code;
    }

    public String sayCode()
    {
        String result = "";
        if (!CodeChecker.isContains5(code)) {
            if (CodeChecker.isContains3(code)) {
                return result + "Fizz";
            }

            if (CodeChecker.isMultipleOf3(code)) {
                result += "Fizz";
            }
        }

        if (CodeChecker.isMultipleOf5(code))
        {
            result += "Buzz";
        }

        if (CodeChecker.isMultipleOf7(code))
        {
            result += "Whizz";
        }

        return result.isEmpty() ? String.valueOf(code) : result;
    }
}
