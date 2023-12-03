package Inhertence;

import java.util.List;

class Employee {
    int salary;

    public Employee(int salary) {
        this.salary = salary;
    }


    void work() {
        System.out.println("working as an employee!");
    }



    int getSalary() {
        return salary;
    }
}
class HRManager extends Employee{
List employee;
int salary;
    public HRManager(int salary) {
        super(salary);
        this.salary = salary;
    }
    void work(){
        System.out.println("Managing employees");
    }
    void addEmployee(){
        System.out.println("Adding new employee!");
    }
}
public class Q5Employee {
    public static void main(String[] args) {
        Employee emp = new Employee(40000);
        HRManager mgr = new HRManager(70000);

        emp.work();
        System.out.println("Employee salary: " + emp.getSalary());

        mgr.work();
        System.out.println("Manager salary: " + mgr.getSalary());
        mgr.addEmployee();
    }
}
