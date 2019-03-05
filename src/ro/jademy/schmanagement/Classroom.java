package ro.jademy.schmanagement;

import ro.jademy.schmanagement.schedule.ScheduleSubject;

import java.util.ArrayList;

public class Classroom {

    String name;
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<ScheduleSubject> timetableClass = new ArrayList<>();

    Classroom (String name){
        this.name=name;
    }

    private void addStudent (Student student){
        students.add(student);
    }

    public String getName () {
        return name;
    }

    public ArrayList<Student> getStudents (){
        return students;
    }

    public ArrayList<ScheduleSubject> getTimetableClass() {
        return timetableClass;
    }
}

