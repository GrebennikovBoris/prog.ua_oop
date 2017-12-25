package Homework3;

public class Human {

    protected String firstName;
    protected String lastName;
    protected boolean sex;
    protected int age;

    public Human(String firstName, String lastName, boolean sex, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Human() {
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public boolean isMale() {
        return sex;
    }


    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
