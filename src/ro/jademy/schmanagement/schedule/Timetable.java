package ro.jademy.schmanagement.schedule;

import java.util.ArrayList;

public class Timetable {

    //prin conventie, indexul elementelor din arrayList corespunde cu zilele saptamanii: e.g. 0 -> Luni etc.
    private ArrayList<DailySchedule> dailyScheduleList = new ArrayList<>();

    public ArrayList<DailySchedule> getDailyScheduleList(){
        return dailyScheduleList;
    }

    public void setDailyScheduleList(DailySchedule s){
        dailyScheduleList.add(s);
    }



}
