package student;

import java.util.ArrayList;

public class Student {
    String name;
    String grade;
    ArrayList<String> courses = new ArrayList<>();

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public void addCourse(String course) { courses.add(course); }
    public void removeCourse(String course) { courses.remove(course); }
}
