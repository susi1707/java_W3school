package OOPs;

import java.util.ArrayList;

class Course{
    String courseName;
    int courseNo;
    Student student ;

    public Course(String courseName, int courseNo, Student student) {
        this.courseName = courseName;
        this.courseNo = courseNo;
        this.student = student;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseNo=" + courseNo +
                ", student=" + student.getName() +
                '}';
    }
}
public class Student {
    String name;
    ArrayList<Course> courses;


    Student(String name){
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }




    void addCourse(Course course){
        courses.add(course);
    }
    ArrayList<Course> getCourses(){
        return courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }

    public static void main(String[] args) {
        Student student1 = new Student("rb");
        Student student2 = new Student("nb");
        Course course1 = new Course("java",01,student1);
        Course course2 = new Course("Js",02,student1);
        Course course3 = new Course("react",03,student2);
        student1.addCourse(course1);
        student1.addCourse(course2);
        student2.addCourse(course3);
        ArrayList<Course> allCourses = new ArrayList<>();
        allCourses.addAll(student1.getCourses());
        allCourses.addAll(student2.getCourses());

        for(Course res: allCourses){
            System.out.println(res);
        }

    }
}
