package Homework3;

import java.io.*;

public class Human implements Externalizable {

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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(firstName);
        out.writeUTF(lastName);
        out.writeBoolean(sex);
        out.writeInt(age);
        out.flush();
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        firstName = in.readUTF();
        lastName = in.readUTF();
        sex = in.readBoolean();
        age = in.readInt();
    }
}
