package interview.easyLevel;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterEmployee {
    private int id;
    private String name;
    private double salary;
    private String department;

    public FilterEmployee(int id, String name, double salary,String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
/*
Write a Java 8 program to filter a list of employees earning more than 50,000 using Streams
output
Bob
Charlie
Eve
 */
    public static void main(String[] args) {
        List<FilterEmployee> employees = Arrays.asList(
                new FilterEmployee(1, "Alice", 45000,"IT"),
                new FilterEmployee(2, "Bob", 55000,"HR"),
                new FilterEmployee(3, "Charlie", 70000,"IT"),
                new FilterEmployee(4, "David", 40000,"Finance"),
                new FilterEmployee(5, "Eve", 90000,"HR"),
                new FilterEmployee(6, "Frank", 12000,"IT")
        );
        employees.stream().filter(e->e.getSalary()>=50000).map(FilterEmployee::getName).forEach(System.out::println);
        System.out.println("-----------------------------Sort a list of employees by salary in descending order using Java Streams -------------------");
        /* Sort a list of employees by salary in descending order using Java Streams */
        employees.stream().sorted(Comparator.comparing(FilterEmployee::getSalary).reversed()).map(FilterEmployee::getName).forEach(System.out::println);
        System.out.println("-----------------------------find the employee with the highest salary and print their name -------------------");
        /*You have a list of employees. Write a Java 8 Stream API program to find the employee with the highest salary and print their name*/
        System.out.println(employees.stream().max(Comparator.comparing(FilterEmployee::getSalary)).map(FilterEmployee::getName) .orElse("No employees available"));
        /*
         Write a Java 8 Stream API program to group employees by their department name and count how many employees are in each department
         */
        System.out.println("-----------------------------Write a Java 8 Stream API program to group employees by their department name and count how many employees are in each department-------------------");
        employees.stream().collect(Collectors.groupingBy(FilterEmployee::getDepartment,Collectors.counting())).entrySet().forEach(System.out::println);

        System.out.println("-----------------------------Write a Java 8 Stream API program to find the average salary of employees in each department-------------------");
        employees.stream().collect(Collectors.groupingBy(FilterEmployee::getDepartment,Collectors.averagingDouble(FilterEmployee::getSalary))).entrySet().forEach(System.out::println);

    }
}
