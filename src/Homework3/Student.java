package Homework3;

public class Student extends Human {
    private int id;

    public Student(String firstName, String lastName, boolean sex, int age) {
        if (firstName.length() == 0 || lastName.length() == 0) {
            System.out.println("First name length or last name length is zero ");
        }
        if (firstName == null || lastName == null) {
            System.out.println("First name or last name is null");
        }
        if (age < 0) {
            System.out.println("Age < 0");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

}
