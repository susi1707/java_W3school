package Collections;

import java.lang.reflect.Array;
import java.util.*;

public class IbsEmployee {
String name;
int hike;
String place;
    public IbsEmployee(String name, int hike, String place) {
        this.name = name;
        this.hike = hike;
        this.place = place;
    }

    public String toString() {
        return "IbsEmployee{" +
                "name='" + name + '\'' +
                ", hike=" + hike +
                ", place='" + place + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<IbsEmployee> employees = new ArrayList<>(Arrays.asList(
                new IbsEmployee("Susi", 3, "kanchipuram"),
                new IbsEmployee("Sridhar", 4, "coimbator"),
                new IbsEmployee("Deepak", 5, "tambaram"),
                new IbsEmployee("Naveen", 2, "chennai")
        ));

        ArrayList ist = new ArrayList<>(Arrays.asList("helloo","susi","rb"));

        ListIterator<String> iterator = ist.listIterator();

        while (iterator.hasNext()) {
            String current = iterator.next();
            if (current.equals("susi")) {
                iterator.set("susindaran");
            }
            System.out.println(current);
        }


//        ListIterator<IbsEmployee> iterator = employees.listIterator();
//
//        while(iterator.hasNext()){
//            IbsEmployee emp = iterator.next();
//            if(emp.hike == 3){
//                emp.hike=5;
//            }
//        }
//
//
//        //employees.sort(new compartorr());
//
//        System.out.println(employees);
    }
}
