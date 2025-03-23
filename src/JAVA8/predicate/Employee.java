package JAVA8.predicate;

public class Employee {
    private int id;
    private String name;
    private String grade;
    private double salary;
    private int age;

    public Employee() {
    }

    public Employee(int id, String name, String grade, double salary,int age) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.salary = salary;
        this.age = age;
    }

    public Employee(Integer integer, String fin, String dev, int salary, int age) {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
