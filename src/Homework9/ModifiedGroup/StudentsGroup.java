package Homework9.ModifiedGroup;

import Homework3.GroupFullException;
import Homework9.ModifiedGroup.Comparators.SortByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentsGroup<T extends Homework3.Student> {
    private List<T> persons;
    private Comparator<T> comparator;

    public StudentsGroup() {
        persons = new ArrayList<>();
        setComparator(new SortByAge());
    }

    public void add(T person) {
        if (person == null) {
            throw new NullPointerException();
        }
        if (persons.size() == 10) {
            throw new GroupFullException();
        }
        if (persons.contains(person)) {
            throw new PersonAlreadyInGroupException();
        }
        persons.add(person);
    }

    public void remove(T person) {
        if (person == null) {
            throw new NullPointerException();
        }
        if (!persons.contains(person)) {
            throw new PersonIsNotInGroupException();
        }
        persons.remove(person);
    }

    public Comparator<T> getComparator() {
        return comparator;
    }

    public void setComparator(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public List<T> getSortedGroup() {
        persons.sort(comparator);
        return persons;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T person : persons) {
            sb.append(person.getId()).append(", ").append(person.getFirstName()).append(", ").append(person.getLastName()).append(", ").append(person.getAge());
            sb.append("\n");
        }

        return sb.toString();
    }
}
