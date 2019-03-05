package ro.jademy.schmanagement.schedule;

import java.util.ArrayList;

public class DailySchedule {
   private ArrayList<ScheduleSubject> scheduleSubjects = new ArrayList<>();



    public void setScheduleSubject(ScheduleSubject s){
        scheduleSubjects.add(s);
    }
}
