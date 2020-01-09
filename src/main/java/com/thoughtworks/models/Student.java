package com.thoughtworks.models;

import com.thoughtworks.utils.CodeChecker;

public class Student {

    private int code;

    public Student(int code) {
        this.code = code;
    }

    public String sayCode()
    {
        if (CodeChecker.isContains3(code))
        {
            return "Fizz";
        }

        if (CodeChecker.isMultipleOf3(code))
        {
            if (CodeChecker.isMultipleOf5(code))
            {
                return "FizzBuzz";
            }

            if (CodeChecker.isMultipleOf7(code))
            {
                return "FizzWhizz";
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
