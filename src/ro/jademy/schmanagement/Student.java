package ro.jademy.schmanagement;

import java.util.*;

public class Student {
    String name;
    ArrayList<Integer> grades = new ArrayList<>();
    Classroom classroom;

    public Student(String name, Classroom classroom) {
        this.name = name;
        this.classroom = classroom;

    }

    public Student(String name, ArrayList<Integer> grades, Classroom classroom) {
        this.name = name;
        this.grades = grades;
        this.classroom = classroom;

    }

}

