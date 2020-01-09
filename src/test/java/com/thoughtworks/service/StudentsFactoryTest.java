package com.thoughtworks.service;

import com.thoughtworks.models.Student;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StudentsFactoryTest {

    @Test
    public void should_generate_students_when_given_the_count_of_students() {
        StudentsFactory factory = new StudentsFactory(1);

        List<Student> students = factory.create();

        assertEquals(1, students.size());
    }
}