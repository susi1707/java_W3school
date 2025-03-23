package JAVA8.predicate;

import java.util.List;
import java.util.stream.Collectors;

public class sortBasedOnLength {
    public static void main(String[] args) {
        List<Employee> empName = List.of(new Employee(101,"john","A",60000,30),
                new Employee(109,"peter","B",30000,21),
                new Employee(102,"markGreySon","A",80000,32),
                new Employee(103,"kim","A",90000,32),
                new Employee(104,"js","C",15000,25));

        List<String> sortedNames = empName.stream()
                .map(e -> e.getName())  // Lambda for extracting names
                .sorted((a, b) -> Integer.compare(b.length(), a.length()))  // Lambda for sorting by length
                .collect(Collectors.toList());

        System.out.println(sortedNames);

//        List<String> sortedNames = empName.stream()
//                .map(Employee::getName)
//                .sorted(Comparator.comparingInt(String::length).reversed())  // Reverse order sorting
//                .collect(Collectors.toList());
//
//        System.out.println(sortedNames);

    }
}
