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

    @Test
    public void should_say_Whizz_when_their_code_is_a_multiple_of_7()
    {
        Student student = new Student(49);

        String code = student.sayCode();

        assertEquals("Whizz", code);
    }

    @Test
    public void should_say_FizzBuzz_when_their_code_is_a_multiple_of_3_and_5()
    {
        Student student = new Student(60);

        String code = student.sayCode();

        assertEquals("FizzBuzz", code);
    }

    @Test
    public void should_say_BuzzWhizz_when_their_code_is_a_multiple_of_5_and_7()
    {
        Student student = new Student(140);

        String code = student.sayCode();

        assertEquals("BuzzWhizz", code);
    }

    @Test
    public void should_say_FizzWhizz_when_their_code_is_a_multiple_of_3_and_7()
    {
        Student student = new Student(21);

        String code = student.sayCode();

        assertEquals("FizzWhizz", code);
    }

    @Test
    public void should_say_Fizz_when_their_code_contains_3()
    {
        Student student = new Student(63);

        String code = student.sayCode();

        assertEquals("Fizz", code);
    }

    @Test
    public void should_not_say_Fizz_when_their_code_contains_5()
    {
        Student student = new Student(35);

        String code = student.sayCode();

        assertEquals("BuzzWhizz", code);
    }
}