package JAVA8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class baasics {
    public  List<Employee> getEmployees(){
        return  Arrays.asList(new Employee(101,"john","A",60000,1),
                        new Employee(109,"peter","B",30000,4),
                        new Employee(102,"mak","A",80000,5),
                        new Employee(103,"kim","A",90000,5),
                        new Employee(104,"json","C",15000,4));

    }

    public static void main(String[] args) {
        baasics employeeDb = new baasics();

        System.out.println(employeeDb.getEmployees().stream().filter(employee1 -> employee1.getGrade()=="A")
                .map(employee1 ->employee1.getSalary())
                .reduce(Double::sum).get());

    }
    }

