package com.thoughtworks.models;

import com.thoughtworks.utils.CodeChecker;
import com.thoughtworks.utils.CodePlaceholder;

public class Student {

    private int code;

    public Student(int code) {
        this.code = code;
    }

    public String sayCode()
    {
        StringBuilder result = new StringBuilder();
        if (!CodeChecker.isContains5(code) || CodeChecker.isContains7(code)) {
            if (CodeChecker.isContains3(code)) {
                return result.append(CodePlaceholder.Fizz.name()).toString();
            }

            if (CodeChecker.isMultipleOf3(code)) {
                result.append(CodePlaceholder.Fizz.name());
            }
        }

        if (CodeChecker.isMultipleOf5(code) && !CodeChecker.isContains7(code))
        {
            result.append(CodePlaceholder.Buzz.name());
        }

        if (CodeChecker.isMultipleOf7(code))
        {
            result.append(CodePlaceholder.Whizz.name());
        }

        return result.toString().isEmpty() ? String.valueOf(code) : result.toString();
    }
}
