package Homework9.ModifiedGroup;

import Homework3.Student;
import Homework9.ModifiedGroup.Comparators.SortByLastName;

public class Main {
    public static void main(String[] args) {
        Student student2 = new Student("Aleksey", "Popruga", true, 29);
        Student student3 = new Student("Aleksander", "Suhoivan", true, 28);
        Student student4 = new Student("Petr", "Zhuravlev", true, 31);
        Student student5 = new Student("Svetlana", "Badeikina", false, 27);
        Student student6 = new Student("Sergei", "Kot", true, 47);
        StudentsGroup studentsGroup = new StudentsGroup();
        studentsGroup.add(student2);
        studentsGroup.add(student3);
        studentsGroup.add(student4);
        studentsGroup.add(student5);
        studentsGroup.add(student6);

        studentsGroup.getSortedGroup();
        System.out.println(studentsGroup);

        studentsGroup.setComparator(new SortByLastName());
        studentsGroup.getSortedGroup();
        System.out.println(studentsGroup);
    }
}
