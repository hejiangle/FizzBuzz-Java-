package com.thoughtworks.utils;

public class CodeChecker {

    public static boolean isMultipleOf3(int code)
    {
        return code % 3 == 0;
    }

    public static boolean isMultipleOf5(int code)
    {
        return code % 5 == 0;
    }

    public static boolean isMultipleOf7(int code)
    {
        return code % 7 == 0;
    }

    public static boolean isContains3(int code)
    {
        return String.valueOf(code).contains("3");
    }

    public static boolean isContains5(int code)
    {
        return String.valueOf(code).contains("5");
    }

    public static boolean isContains7(int code)
    {
        return String.valueOf(code).contains("7");
    }
}
