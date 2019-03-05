package ro.jademy.schmanagement;

import ro.jademy.schmanagement.schedule.DailySchedule;
import ro.jademy.schmanagement.schedule.ScheduleSubject;
import ro.jademy.schmanagement.schedule.Timetable;

public class Main {

    public static void main(String[] args) {
        // write your code here



        // cream o scoala
        // cream, clase, le punem in scoala
        // etc.

        School school = new School();

        SchoolYear newYear = new SchoolYear(2019);

        Classroom c1 = new Classroom("firstClass");
        Classroom c2 = new Classroom("secondClass");

        Teacher t1 = new Teacher("Troie");
        Teacher t2 = new Teacher("Costache");

        Subject maths = new Subject("maths", t1);
        Subject english = new Subject ("english", t2);

        Student s1 = new Student("Bob");
        Student s2 = new Student ("Gabi");

        ScheduleSubject sbj1 = new ScheduleSubject(maths, 9);
        ScheduleSubject sbj2 = new ScheduleSubject(maths, 10);
        ScheduleSubject sbj3 = new ScheduleSubject(english, 12);

        DailySchedule monday = new DailySchedule();
        monday.setScheduleSubject(sbj1);
        monday.setScheduleSubject(sbj2);
        monday.setScheduleSubject(sbj3);

        Timetable c1timetable = new Timetable();
        c1timetable.setDailyScheduleList(monday);
    }
}
