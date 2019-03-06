package ro.jademy.schmanagement;

import ro.jademy.schmanagement.schedule.DailySchedule;
import ro.jademy.schmanagement.schedule.ScheduleSubject;
import ro.jademy.schmanagement.schedule.Timetable;

import java.time.Year;

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

        school.setClasses(c1);
        school.setClasses(c2);

        newYear.setClasses(c1);
        newYear.setClasses(c2);

        Teacher t1 = new Teacher("Troie");
        Teacher t2 = new Teacher("Costache");

        Subject maths = new Subject("maths", t1);
        Subject english = new Subject("english", t2);

        Student s1 = new Student("Bob");
        Student s2 = new Student("Gabi");

        c1.setStudent(s1);
        c1.setStudent(s2);

        s1.setGrades(10);
        s1.setGrades(9);
        s1.setGrades(7);

        ScheduleSubject sbj1 = new ScheduleSubject(maths, 9);
        ScheduleSubject sbj2 = new ScheduleSubject(maths, 10);
        ScheduleSubject sbj3 = new ScheduleSubject(english, 12);

        DailySchedule monday = new DailySchedule();
        monday.setScheduleSubject(sbj1);
        monday.setScheduleSubject(sbj2);
        monday.setScheduleSubject(sbj3);

        DailySchedule tuesday = new DailySchedule();
        tuesday.setScheduleSubject(sbj3);
        tuesday.setScheduleSubject(sbj2);
        tuesday.setScheduleSubject(sbj3);

        Timetable firstClassTimetable = new Timetable();
        firstClassTimetable.setDailyScheduleList(monday);
        firstClassTimetable.setDailyScheduleList(tuesday);

        c1.setTimetable(firstClassTimetable);



//        System.out.println(s1.getGrades());
//        System.out.println(s1.toString());
//        System.out.println(maths.getName());
//        System.out.println(english.toString());
//        System.out.println(c1.toString());
//        System.out.println(firstClassTimetable.toString());
//        System.out.println(monday.toString());
        System.out.println(firstClassTimetable.getDailyScheduleList().size());
        firstClassTimetable.printTimetable();
    }
}
