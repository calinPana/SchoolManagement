package ro.jademy.schmanagement;

import java.util.ArrayList;

public class School {
    private ArrayList<Classroom> classes = new ArrayList<>();

    public void setClasses(Classroom cls) {
        classes.add(cls);
    }

    @Override
    public String toString() {
        return "School{" +
                "classes=" + classes +
                '}';
    }
}
