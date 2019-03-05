package ro.jademy.schmanagement.schedule;

import ro.jademy.schmanagement.Subject;

public class ScheduleSubject {
    private Subject subject;
    private int startTime;

    public ScheduleSubject(Subject subject, int startTime){
        this.subject=subject;
        this.startTime=startTime;
    }

    public Subject getSubject(){
        return subject;
    }

    public int getStartTime(){
        return startTime;
    }

}
