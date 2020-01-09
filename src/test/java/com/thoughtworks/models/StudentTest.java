package com.thoughtworks.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void should_say_their_own_code()
    {
        Student student = new Student(1);

        String code = student.sayCode();

        assertEquals("1", code);
    }

    @Test
    public void should_say_Fizz_when_their_code_is_a_multiple_of_3()
    {
        Student student = new Student(9);

        String code = student.sayCode();

        assertEquals("Fizz", code);
    }

    @Test
    public void should_say_Buzz_when_their_code_is_a_multiple_of_5()
    {
        Student student = new Student(25);

        String code = student.sayCode();

        assertEquals("Buzz", code);
    }
}