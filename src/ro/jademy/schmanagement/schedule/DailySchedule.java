package ro.jademy.schmanagement.schedule;

import java.util.ArrayList;

public class DailySchedule {
    private ArrayList<ScheduleSubject> scheduleSubjects = new ArrayList<>();

    public ArrayList<ScheduleSubject> getScheduleSubjectList() {
        return scheduleSubjects;
    }

    public void setScheduleSubject(ScheduleSubject s) {
        scheduleSubjects.add(s);
    }

    @Override
    public String toString() {
        return "DailySchedule{" +
                "scheduleSubjects=" + scheduleSubjects +
                '}';
    }
}
