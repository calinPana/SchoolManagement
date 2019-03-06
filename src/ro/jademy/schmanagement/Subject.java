package ro.jademy.schmanagement;

import java.util.ArrayList;

public class Subject {
    String name;
    Teacher teacher;

    public Subject(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName()

    {
        return name;
    }


    public Teacher getTeacher() {
        return teacher;
    }

//    public String toString() {
//        return this.name + " is taught by " + this.teacher.getName();
//    }


    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}