package school;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School();
        Student s = new Student("Liam");
        Teacher t = new Teacher("Ms. Clara");
        school.addStudent(s);
        school.addTeacher(t);
        System.out.println(s.name + " and " + t.name + " added.");
    }
}
