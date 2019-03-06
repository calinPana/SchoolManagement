package ro.jademy.schmanagement;

import java.util.ArrayList;

public class SchoolYear {
    private int year;
    private ArrayList<Classroom> classes = new ArrayList<>();

    public SchoolYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setClasses(Classroom cls) {
        classes.add(cls);
    }

    @Override
    public String toString() {
        return "SchoolYear{" +
                "year=" + year +
                ", classes=" + classes +
                '}';
    }
}
