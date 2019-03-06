package ro.jademy.schmanagement;

import ro.jademy.schmanagement.schedule.ScheduleSubject;
import ro.jademy.schmanagement.schedule.Timetable;

import java.util.ArrayList;

public class Classroom {

    private String name;
    private ArrayList<Student> students = new ArrayList<>();
    //ArrayList<ScheduleSubject> timetableClass = new ArrayList<>();
    private Timetable timetable = new Timetable();

    Classroom (String name){
        this.name=name;
    }

       public String getName () {
        return name;
    }

    public ArrayList<Student> getStudents (){
        return students;
    }

    public Timetable getTimetable() {
        return timetable;
    }

    public void setStudent (Student student){
        students.add(student);
    }

    public void setTimetable(Timetable timetable){
        this.timetable=timetable;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "name='" + name + '\'' +
                ", students=" + students +
                ", timetable=" + timetable +
                '}';
    }
}

