package interview;

import java.util.HashMap;
import java.util.Map;

public class repeatString {
    public static void main(String[] args) {
        String m = "kiss";
        char[] arr = m.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();

        for (char c: arr ) {
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }else{
            hm.put(c,1);
        }}
        for(Map.Entry<Character,Integer> res: hm.entrySet())
            if(res.getValue()>1){
            System.out.println(res.getKey());
    }}
}
