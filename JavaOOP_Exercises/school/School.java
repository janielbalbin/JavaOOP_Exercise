package school;

import java.util.ArrayList;

public class School {
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Teacher> teachers = new ArrayList<>();

    public void addStudent(Student s) { students.add(s); }
    public void addTeacher(Teacher t) { teachers.add(t); }
}
