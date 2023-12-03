package interview;

import java.util.*;

public class twolistsort {
    public static void main(String[] args) {
        int[] a = {1,3,4,6,7,10};
        int[]  b= {1,2,4,5,9,10,3,1};

        Set num =new HashSet();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <b.length ; j++) {
                if(a[i]==b[j]){
                    num.add(a[i]);
                }
            }
        }
        System.out.println(num);


    }

}
