package com.thoughtworks.models;

import com.thoughtworks.utils.CodeChecker;

public class Student {

    private int code;

    public Student(int code) {
        this.code = code;
    }

    public String sayCode()
    {
        if (CodeChecker.isMultipleOf3(code))
        {
            if (CodeChecker.isMultipleOf5(code))
            {
                return "FizzBuzz";
            }

            return "Fizz";
        }

        if (CodeChecker.isMultipleOf5(code))
        {
            if (CodeChecker.isMultipleOf7(code))
            {
                return "BuzzWhizz";
            }
            return "Buzz";
        }

        if (CodeChecker.isMultipleOf7(code))
        {
            return "Whizz";
        }

        return String.valueOf(code);
    }
}
