package Homework8.MiniDataBase;

import Homework3.Group;
import Homework3.Student;

public class TestBase {

    public TestBase() {

    }

    public static MiniDataBase init() {
        MiniDataBase base = new MiniDataBase();
        Group group = new Group("KT");
        group.addStudent(new Student("Grebennikov", "Boris", true, 29));
        group.addStudent(new Student("Popruga", "Aleksei", true, 30));
        group.addStudent(new Student("Man'ko", "Irina", false, 25));
        group.addStudent(new Student("Kurilovich", "Boris", true, 27));
        base.addGroup(group);
        Group group1 = new Group("EKT");
        group1.addStudent(new Student("Popruga", "Ivan", true, 28));
        group1.addStudent(new Student("Golyunova", "Karina", false, 25));
        group1.addStudent(new Student("Studinskaya", "Mariya", false, 24));
        group1.addStudent(new Student("Alekseev", "Aleksander", true, 35));
        group1.addStudent(new Student("Kurilo", "Irina", false, 28));
        base.addGroup(group1);
        return base;

    }

}
