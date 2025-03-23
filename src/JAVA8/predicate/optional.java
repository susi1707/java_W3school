package JAVA8.predicate;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class optional {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(101, "John", "HR", 60000,2),
                new Employee(102, "Emma", "IT", 80000,45),
                new Employee(103, "Alex", "HR", 75000,4),
                new Employee(104, "Sophia", "IT", 90000,7),
                new Employee(105, "Liam", "Finance", 70000,7),
                new Employee(106, "Oliver", "Finance", 65000,9)
        );

        int id = 1106;

        Optional<Employee> findId = employees.stream().filter(fil -> fil.getId()==id).findFirst();
        System.out.println(findId.map(emp -> emp.getName()).orElse("Anyonimus"));
        //System.out.println(findId.map(emp -> emp.getName()).orElseThrow(() -> new IllegalArgumentException("Id not found.")));



//Optional
        Employee emp1 = new Employee(null, "Fin", "Dev", 653000,12);

        Optional<Integer> employeeOptional = Optional.of(emp1.getId());
        employeeOptional.ifPresentOrElse(idValue -> System.out.println(idValue),()-> System.out.println("Empty"));
    }
}
