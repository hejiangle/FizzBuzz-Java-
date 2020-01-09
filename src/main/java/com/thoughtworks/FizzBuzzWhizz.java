package com.thoughtworks;

import com.thoughtworks.models.Student;
import com.thoughtworks.service.StudentsFactory;

import java.util.List;

public class FizzBuzzWhizz {

    public static void main(String[] args) {
        StudentsFactory factory = new StudentsFactory(120);

        List<Student> students = factory.create();

        students.forEach(student -> System.out.println(student.sayCode()));
    }
}
