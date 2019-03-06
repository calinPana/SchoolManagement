package ro.jademy.schmanagement.schedule;

import ro.jademy.schmanagement.Subject;

public class ScheduleSubject {
    private Subject subject;
    private int startTime;

    public ScheduleSubject(Subject subject, int startTime) {
        this.subject = subject;
        this.startTime = startTime;
    }

    public Subject getSubject() {
        return subject;
    }

    public int getStartTime() {
        return startTime;
    }

//    public String toString() {
//        return this.subject.getName() + " is taught by " + this.subject.getTeacher().getName() + " starting at " + this.startTime;
//    }

    @Override
    public String toString() {
        return "ScheduleSubject{" +
                "subject=" + subject +
                ", startTime=" + startTime +
                '}';
    }
}
