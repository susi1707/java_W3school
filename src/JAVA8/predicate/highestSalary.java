package JAVA8.predicate;

import java.util.*;
import java.util.stream.Collectors;

//output
//HR -> Alex (75000)
//        IT -> Sophia (90000)
//        Finance -> Liam (70000)
public class highestSalary {
    public static void main(String[] arg ){
        List<Employee> employees = List.of(
                new Employee(101, "John", "HR", 60000,2),
                new Employee(102, "Emma", "IT", 80000,45),
                new Employee(103, "Alex", "HR", 75000,4),
                new Employee(104, "Sophia", "IT", 90000,7),
                new Employee(105, "Liam", "Finance", 70000,7),
                new Employee(106, "Oliver", "Finance", 65000,9)
        );

        Map<String,Employee> high = employees.stream().collect(Collectors.groupingBy(emp -> emp.getGrade(),
                Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparingInt(sal -> (int) sal.getSalary())), // Find max salary employee
                        Optional::get // Extract employee from Optional
                )
        ));
        high.forEach((str,emp) -> System.out.println(emp.getGrade() +"-> "+ emp.getName()+ "("+emp.getSalary()+")"));


    }
}
