package com.thoughtworks.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void should_say_their_own_code(){
        Student student = new Student(1);

        int code = student.sayCode();

        assertEquals(1, code);
    }
}