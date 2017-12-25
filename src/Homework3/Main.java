package Homework3;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Boris", "Grebennikov", true, 29);
        Student student1 = new Student("Tanya", "Grebennikova", false, 28);
        Student student2 = new Student("Aleksey", "Popruga", true, 29);
        Student student3 = new Student("Aleksander", "Suhoivan", true, 28);
        Student student4 = new Student("Petr", "Zhuravlev", true, 31);
        Student student5 = new Student("Svetlana", "Badeikina", false, 27);
        Student student6 = new Student("Sergei", "Kot", true, 47);
        Student student7 = new Student("Vyacheslav", "Pavlenko", true, 57);
        Student student8 = new Student("Ivan", "Popruga", true, 27);
        Student student9 = new Student("Vadim", "Studinskiy", true, 26);
        Student student10 = new Student("Ivan", "Ivanov", true, 54);
        Group group = new Group("OurGroup");
        group.addStudent(student);
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student5);
        group.addStudent(student6);
        group.addStudent(student7);
        group.addStudent(student8);
        group.addStudent(student9);
//        group.addStudent(student10);
        group.searchStudentsByLastName("Kovalev");
        group.searchStudentsByLastName("Pavlenko");
        group.deleteStudent(student6);
        group.deleteStudent(student2);
        group.deleteStudent(student);
        System.out.println(group.toString());
    }
}
