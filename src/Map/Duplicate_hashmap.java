package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Duplicate_hashmap {
    public static void main(String[] args) {
        //Dulicate check
        String s = "success";
        char[] arr = s.toCharArray();
        HashMap<Character,Integer> hm = new HashMap();

        for (char c : arr) {
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
            else{
                hm.put(c,1);
            }
        }
        System.out.println(hm);
        Set<Map.Entry<Character, Integer>> set = hm.entrySet();
        System.out.println(set);
        for (Map.Entry<Character, Integer> res: set ) {
            if(res.getValue()>1)
                System.out.println(res.getKey());

        }

    }
}
