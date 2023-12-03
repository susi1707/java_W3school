package OOPs;

import java.util.ArrayList;
//Write a Java program to create a class called "School"
// with attributes for students, teachers, and classes, and methods to add and remove students and teachers, and to create classes
class Students{
    String student;
    int age;

    public Students(String student, int age) {
        this.student = student;
        this.age = age;
    }
}
class Teacher{
    String name;
    String classes;

    public Teacher(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacher='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
class SchoolClass{
    String name;
    Teacher teacher;
    ArrayList student;

    public SchoolClass(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        this.student = new ArrayList<>();
    }
    ArrayList<Student> addStudent(Students students){
        student.add(students);
        return student;
    }

}
public class School {
    ArrayList<Students> student;
    ArrayList<Teacher> teacher;
    ArrayList<SchoolClass> classes;

School(){
    this.student = new ArrayList();
    this.teacher = new ArrayList();
    this.classes = new ArrayList();
}
    ArrayList<Students> addStudent(Students add){
        student.add(add);
        return student;

    }
    ArrayList<Students> removeStudent(Students add){
        student.remove(add);
        return student;

    }
    ArrayList<Teacher> addTeacher(Teacher add){
        teacher.add(add);
        return teacher;

    }
    ArrayList<SchoolClass> addClass(SchoolClass add){
        classes.add(add);
        return classes;

    }
    public static void main(String[] args) {
        School school = new School();
        Students student1 = new Students("Mats Yatzil", 15);
        Students student2 = new Students("Karolina Ralf", 16);
        Students student3 = new Students("Felicie Anuschka", 16);
        Students student4 = new Students("Norbert Micha", 15);

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);

        Teacher teacher1 = new Teacher("Jens Amalia", "Math");
        Teacher teacher2 = new Teacher("Elise Giiwedin", "English");
        Teacher teacher3 = new Teacher("Angelika Lotta", "Science");

        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        school.addTeacher(teacher3);

        SchoolClass mathClass = new SchoolClass("Mathematics", teacher1);
        mathClass.addStudent(student1);
        mathClass.addStudent(student2);
        mathClass.addStudent(student3);
        mathClass.addStudent(student4);

        SchoolClass englishClass = new SchoolClass("English", teacher2);
        englishClass.addStudent(student1);
        englishClass.addStudent(student2);
        englishClass.addStudent(student3);

        SchoolClass scienceClass = new SchoolClass("Science", teacher3);
        scienceClass.addStudent(student1);
        scienceClass.addStudent(student2);
        scienceClass.addStudent(student3);
        scienceClass.addStudent(student4);

        school.addClass(mathClass);
        school.addClass(englishClass);
        school.addClass(scienceClass);

        System.out.println("School information:");
        System.out.println("Number of students: " + school.student.size());
        System.out.println("Number of teachers: " + school.teacher.size());
        System.out.println("Number of classes: " + school.classes.size());
        System.out.println();

        System.out.println("Math class information:");
        System.out.println("Class name: " + mathClass.name);
        System.out.println("Teacher: " + mathClass.teacher);
        System.out.println("Number of students: " + mathClass.student.size());
        System.out.println();


        System.out.println("English class information:");
        System.out.println("Class name: " + englishClass.name);
        System.out.println("Teacher: " + englishClass.teacher.name);
        System.out.println("Number of students: " + englishClass.student.size());
        System.out.println();

        System.out.println("Science class information:");
        System.out.println("Class name: " + scienceClass.name);
        System.out.println("Teacher: " + scienceClass.teacher.name);
        System.out.println("Number of students: " + scienceClass.student.size());
        System.out.println();
        /*

        school.removeStudent(student1);
        school.removeTeacher(teacher2);
        school.removeClass(mathClass);

        System.out.println("School information after removing one student, teacher and Class:");
        System.out.println("Number of students: " + school.getStudents().size());
        System.out.println("Number of teachers: " + school.getTeachers().size());
        System.out.println("Number of classes: " + school.getClasses().size());
    */}
    }

