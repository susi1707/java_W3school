package JAVA8.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Filter Employees Based on high Salary
public class predicateEx {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(101, "John", "HR", 60000,2),
                new Employee(102, "Emma", "IT", 80000,45),
                new Employee(103, "Alex", "HR", 75000,4),
                new Employee(104, "Sophia", "IT", 90000,7),
                new Employee(105, "Liam", "Finance", 70000,7),
                new Employee(106, "Oliver", "Finance", 65000,9)
        );

        Predicate<Employee> highSalary = (emp)->emp.getSalary()>70000;
        employees.stream().filter(highSalary).map(e->e.getName()+" -> "+ e.getSalary()).forEach(System.out::println);
        for (Employee emps: employees ) {
            if(highSalary.test(emps)){
                System.out.println(emps.getName());
            }
        }

    }
}
