package student;

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student("Mark", "10th Grade");
        s.addCourse("Math");
        s.addCourse("Science");
        System.out.println(s.name + " enrolled in: " + s.courses);
    }
}
