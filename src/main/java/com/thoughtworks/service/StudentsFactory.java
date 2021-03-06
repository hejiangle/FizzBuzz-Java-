package com.thoughtworks.service;

import com.thoughtworks.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentsFactory {

    private int countOfStudents;

    public StudentsFactory(int countOfStudents)
    {
        this.countOfStudents = countOfStudents;
    }

    public List<Student> create()
    {
        List<Student> students = new ArrayList<>(countOfStudents);

        for(int code = 1; code <= countOfStudents; code++) {
            students.add(new Student(code));
        }

        return students;
    }
}
