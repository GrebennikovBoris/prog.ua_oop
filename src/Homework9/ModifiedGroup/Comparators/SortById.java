package Homework9.ModifiedGroup.Comparators;

import Homework3.Student;

import java.util.Comparator;

public class SortById<T extends Student> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getAge() - o2.getAge();
    }
}
