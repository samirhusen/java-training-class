// 10. Create a Student with name, grade, and courses attributes,
//     and methods to add and remove courses.

import java.util.ArrayList;

public class Student {

    private String name;
    private int grade;
    private ArrayList<String> courses = new ArrayList<>();

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public void displayCourses() {
        System.out.println("Courses: " + courses);
    }

    public static void main(String[] args) {
        Student student = new Student("Samir Husen", 12);

        student.addCourse("Java");
        student.addCourse("Mathematics");
        student.addCourse("English");

        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        student.displayCourses();

        student.removeCourse("English");

        System.out.println("After removing English:");
        student.displayCourses();
    }
}
