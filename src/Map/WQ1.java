package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WQ1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hash_map = new HashMap<>();
        HashMap<Integer,String> hash_map2 = new HashMap<>();
        HashMap<Integer,String> clone_map = new HashMap<>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");

        hash_map2.put(4, "White");
        hash_map2.put(5, "Blue");
        hash_map2.put(6, "Orange");

//Q1-iterate the value
        for (Map.Entry res: hash_map.entrySet()) {
           // System.out.println(res.getKey()+" "+res.getValue());
        }
//Q2-size of hash_map
      //  System.out.println(hash_map.size());
//Q3 - all two mapp to single map
        //hash_map.putAll(hash_map2);
       // System.out.println(hash_map);
//Q4 - Remove all mapping
        //hash_map.clear();
       // System.out.println(hash_map);
//Q5 - check whether a map contains key-value mappings (empty) or not
        //System.out.println(hash_map.isEmpty());
//Q6 - shallow copy of a HashMap instance
        clone_map = (HashMap<Integer, String>) hash_map.clone();
        //System.out.println(clone_map);
//Q7 - test if a map contains a mapping for the specified key
            /*for (Map.Entry entry : hash_map.entrySet()) {
                if ("Green".equals(entry.getValue())) {
                    System.out.println("yes! - " + entry.getKey());
                    break;
                }
            }*/
//Q8 - map to set
        /*Set set = hash_map.entrySet();
        System.out.println(set);*/
//Q10-get the value of a specified key in a map.

          String val =  hash_map.get(3);
                System.out.println("Value for key 3 is: "+val);
        }

}

