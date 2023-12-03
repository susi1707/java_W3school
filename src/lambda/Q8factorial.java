package lambda;

import java.util.stream.IntStream;

public class Q8factorial {
    public static void main(String[] args) {
        int fact =7;
        System.out.println(
        IntStream.rangeClosed(1,fact).reduce(1,(a,b)->a*b));

    }
}
 /*
 Q8factorial Q8 = new Q8factorial();
        System.out.println(Q8.factorial(7));

                }
public int factorial(int num){
        int res = 1;
        for (int i=1; i<=num; i++){
        res = res*i;
        }
        return res;
        }*/
