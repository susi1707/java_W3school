package JAVA8.predicate;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class findGroupingAge {
    public static void main(String[] args) {
        List<Employee> empAge = List.of(new Employee(101,"john","A",60000,30),
                new Employee(109,"peter","B",30000,21),
                new Employee(102,"markGreySon","A",80000,32),
                new Employee(103,"kim","A",90000,32),
                new Employee(104,"js","C",15000,25));
        Map<Integer, List<String>> ageToNames = empAge.stream()
                .collect(Collectors.groupingBy(
                        Employee::getAge, TreeMap::new,
                        Collectors.mapping(Employee::getName, Collectors.toList())
                ));

        // Print grouped employee names by age
        ageToNames.forEach((age, names) ->
                System.out.println("Age " + age + " -> " + names));
    }

    }
