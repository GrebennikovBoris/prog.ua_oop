package Homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Group {
    private Student[] students;
    private int MAX_SIZE = 10;
    private String groupName;
    private int count;

    public Group(String groupName) {
        this.groupName = groupName;
        students = new Student[MAX_SIZE];

    }

    public Group() {
        groupName = "";
        students = new Student[MAX_SIZE];
    }

    public void addStudent(Student student) {
        if (count >= MAX_SIZE) {
            throw new GroupFullException();
        }
        if (student != null) {
            students[count] = student;
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
            students[student.getId()] = null;
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
                    Arrays.sort(students, new Comparator<Student>() {
                        @Override
                        public int compare(Student s1, Student s2) {
                            if (s1 == null && s2 == null) return 0;
                            if (s1 == null) return -1;
                            if (s2 == null) return 1;
                            return s1.getLastName().compareToIgnoreCase(s2.getLastName());
                        }
                    });
                    break;
                case 2:
                    Arrays.sort(students, new Comparator<Student>() {
                        @Override
                        public int compare(Student s1, Student s2) {
                            if (s1 == null && s2 == null) return 0;
                            if (s1 == null) return -1;
                            if (s2 == null) return 1;
                            return s1.getFirstName().compareToIgnoreCase(s2.getFirstName());
                        }
                    });
                    break;
                case 3:
                    Arrays.sort(students, new Comparator<Student>() {

                        @Override
                        public int compare(Student s1, Student s2) {
                            if (s1 == null && s2 == null) return 0;
                            if (s1 == null) return -1;
                            if (s2 == null) return 1;
                            return s1.getAge() - s2.getAge();
                        }
                    });
                    break;
                case 4:
                    Arrays.sort(students, new Comparator<Student>() {
                        @Override
                        public int compare(Student s1, Student s2) {
                            return s1.getId() - s2.getId();
                        }
                    });
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
}
