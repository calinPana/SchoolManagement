package ro.jademy.schmanagement.schedule;

import java.util.ArrayList;

public class Timetable {

    //prin conventie, indexul elementelor din arrayList corespunde cu zilele saptamanii: e.g. 0 -> Luni etc.
    private ArrayList<DailySchedule> dailyScheduleList = new ArrayList<>();

    public ArrayList<DailySchedule> getDailyScheduleList() {
        return dailyScheduleList;
    }

    public void setDailyScheduleList(DailySchedule s) {
        dailyScheduleList.add(s);
    }

    @Override
    public String toString() {
        return "Timetable{" +
                "dailyScheduleList=" + dailyScheduleList +
                '}';
    }

    public void printTimetable() {
        for (int i = 0; i < dailyScheduleList.size(); i++) {

            DailySchedule d = dailyScheduleList.get(i);
            String currentDay = "";
            switch (i) {
                case 0:
                    currentDay = "Monday";
                    break;
                case 1:
                    currentDay = "Tuesday";
                    break;
                case 2:
                    currentDay = "Wednesday";
                    break;
                case 3:
                    currentDay = "Thursday";
                    break;
                case 4:
                    currentDay = "Friday";
                    break;
            }


            // aici ne aflam e ziua luni sau marti sau miercuri, etc.
            System.out.println(currentDay.toUpperCase() + ": ");

            // aici ciclam prin materiile din ziua luni
            for (ScheduleSubject scheduleSubject : d.getScheduleSubjectList()) {
                // pentru fiecare element de tip [materie/ora] din lista de [materii/ore]

                System.out.println(scheduleSubject.getStartTime() + ": " + scheduleSubject.getSubject().getName());
            }


//            for (int j = 0; j < d.getScheduleSubjectList().size(); j++) {
//                System.out.println(currentDay.toUpperCase() + ": " + d.getScheduleSubjectList().get(j).getStartTime() + ": " +
//                        d.getScheduleSubjectList().get(j).getSubject().getName());
//            }
        }
    }
}
