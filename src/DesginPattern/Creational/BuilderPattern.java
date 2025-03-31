package DesginPattern.Creational;

class Employee{
    private String name;
    private int age;
    private String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}
class EmployeeBuilder{
    private String name;
    private int age;
    private String department;

    public EmployeeBuilder setName(String name) {
        this.name=name;
        return this;
    }

    public EmployeeBuilder setAge(int age) {
        this.age=age;
        return this;
    }

    public EmployeeBuilder setDepartment(String department) {
        this.department=department;
        return this;
    }
    public Employee builder(){
        return new Employee(name,age,department);
    }
}
public class BuilderPattern {
    public static void main(String[] args) {
        Employee emp = new EmployeeBuilder().setName("susi").builder();
        Employee emp2 = new EmployeeBuilder().setName("rb").setAge(27).builder();
        System.out.println(emp);
        System.out.println(emp2);
    }
}
