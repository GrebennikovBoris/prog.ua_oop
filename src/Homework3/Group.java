package Homework3;

import java.io.*;
import java.util.*;

public class Group implements Voenkom,Externalizable {
    private List<Student> students;
    private int MAX_SIZE = 10;
    private String groupName;
    private int count;

    public Group(String groupName) {
        this.groupName = groupName;
        students = new ArrayList<>(MAX_SIZE);
    }

    public Group() {
        groupName = "";
        students = new ArrayList<>(MAX_SIZE);
    }

    public void addStudent() {
        if (students.size() < MAX_SIZE) {
            try {
               BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("First name :");
                String firstName = reader.readLine();
                System.out.println("Last name :");
                String lastName = reader.readLine();
                System.out.println("Sex :");
                String sex = reader.readLine();
                System.out.println("Age:");
                String age = reader.readLine();
                boolean s;
                s = sex.equalsIgnoreCase("Male");
                students.add(new Student(firstName, lastName, s, Integer.parseInt(age)));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Too many students");
            throw new GroupFullException();
        }
    }

    public void addStudent(Student student) {
        if (count >= MAX_SIZE) {
            throw new GroupFullException();
        }
        if (student != null) {
            students.add(student);
            student.setId(count);
            count++;
            System.out.println("Student add");
        }

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void deleteStudent(Student student) {
        if (student != null) {
            students.remove(student);
            System.out.println("Student delete");
        }
    }

    public void searchStudentsByLastName(String lastName) {
        boolean find = false;
        if (lastName == null || lastName.equals("")) {
            System.out.println("Last name isn't correct");
        }
        for (Student student : students) {
            if (student.getLastName().equals(lastName)) {
                System.out.println("Student : " + student);
                find = true;
                break;
            }
        }
        if (!find) {
            System.out.println("Student isn't found");
        }
    }

    private void sortByLastName() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1 == null && s2 == null) return 0;
                if (s1 == null) return -1;
                if (s2 == null) return 1;
                return s1.getLastName().compareToIgnoreCase(s2.getLastName());
            }
        });
    }

    private void sortByFirstName() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1 == null && s2 == null) return 0;
                if (s1 == null) return -1;
                if (s2 == null) return 1;
                return s1.getFirstName().compareToIgnoreCase(s2.getFirstName());
            }
        });
    }

    private void sortByAge() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1 == null && s2 == null) return 0;
                if (s1 == null) return -1;
                if (s2 == null) return 1;
                return s1.getAge() - s2.getAge();
            }
        });
    }

    private void sortById() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getId() - s2.getId();
            }
        });
    }

    private void getCompareGroup() {
        System.out.println("What kind of compare this group do you want ?");
        System.out.println("1 - by last name");
        System.out.println("2 - by first name");
        System.out.println("3 - by age");
        System.out.println("4 - by id");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int number = Integer.parseInt(reader.readLine());
            switch (number) {
                case 1:
                    sortByLastName();
                    break;
                case 2:
                    sortByFirstName();
                    break;
                case 3:
                    sortByAge();
                    break;
                case 4:
                    sortById();
                    break;

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException ignored) {

        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        getCompareGroup();
        for (Student student : students) {
            if (student != null) {
                s.append(student.toString()).append(System.lineSeparator());
            }
        }
        return "Group " + groupName + "{" +
                "students=" + System.lineSeparator() + s +
                '}';
    }

    @Override
    public Student[] getStudentsArray() {
        return students.stream().filter(s -> s.isMale() && s.age > 18).toArray(Student[]::new);
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(students);
        out.writeInt(MAX_SIZE);
        out.writeUTF(groupName);
        out.writeInt(count);
        out.flush();
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        students = (List<Student>) in.readObject();
        MAX_SIZE = in.readInt();
        groupName = in.readUTF();
        count = in.readInt();

    }
}
