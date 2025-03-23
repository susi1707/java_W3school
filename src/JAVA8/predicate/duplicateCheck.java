package JAVA8.predicate;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class duplicateCheck {
    public static void main(String[] args) {
        List<Integer> num = List.of(1,1,2,3,4,5,5,57,7,6,6);
//function.identity will return watever i have in counting
        Map<Integer,Long> dup = num.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(dup.entrySet().stream().filter(nim -> nim.getValue() >1).map(mp->mp.getKey()).collect(Collectors.toSet()));



      List<Employee> emp = List.of(new Employee(101,"john","A",60000,1),
              new Employee(109,"peter","B",30000,1),
              new Employee(102,"mak","A",80000,2),
              new Employee(103,"kim","A",90000,2),
              new Employee(104,"json","C",15000,5));

       // Double salary = emp.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
       //emp.stream().filter(grade -> grade.getGrade().equals("A")).map(e ->  "EmpName: " + e.getName() + ", EmpSalary: " + e.getSalary()).forEach(System.out::println);


//        HashMap<Character,Integer> hm = new HashMap<>();
//
//        for (char duplicate:c ) {
//            if(hm.containsKey(duplicate)){
//                hm.put(duplicate,hm.get(duplicate)+1);
//            }else{
//                hm.put(duplicate,1);
//            }
//        }
//
//       hm.entrySet().stream().filter(name -> name.getValue()>1).map(dup -> dup.getKey()).forEach(System.out::println);

    }
}
