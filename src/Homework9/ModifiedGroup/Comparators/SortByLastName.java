package Homework9.ModifiedGroup.Comparators;

import Homework3.Student;

import java.util.Comparator;

public class SortByLastName<T extends Student> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        if (o1 == null && o2 == null) return 0;
        if (o1 == null) return -1;
        if (o2 == null) return 1;
        return o1.getLastName().compareToIgnoreCase(o2.getLastName());
    }
}
