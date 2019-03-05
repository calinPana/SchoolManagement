package ro.jademy.schmanagement;

import java.util.*;

public class Student {
    String name;
    ArrayList<Integer> grades = new ArrayList<>();
//    Classroom classroom;

    public Student(String name) {
        this.name = name;

    }

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;

    }

    public String getName(){
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade (Integer grade){
        grades.add(grade);
    }

}

