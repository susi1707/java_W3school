package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapclass {
    String name;
    int age;

    public mapclass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public mapclass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        HashMap<Integer,mapclass> hm = new HashMap<>();
        mapclass mc = new mapclass();
        hm.put(1,new mapclass("susi",25));
        hm.put(2,new mapclass("rb",26));
        Iterator<Map.Entry<Integer, mapclass>> it = hm.entrySet().iterator();

        while (it.hasNext()){
            Map.Entry<Integer,mapclass> ME = it.next();
            if(ME.getValue().getAge() == 25){
                ME.getValue().setAge(26);
            }
            System.out.println(ME);
        }



    }
}
