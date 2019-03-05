package ro.jademy.schmanagement;

import java.util.ArrayList;

public class SchoolYear {
    private int year;
    private ArrayList<Classroom> classes;

    public SchoolYear(int year) {
        this.year = year;
    }

    public void addClass(Classroom cls) {
        classes.add(cls);
    }
}
