package lambda;

import java.util.function.Function;

public class AndThen {
    public static void main(String[] args) {
        Function<Integer,Integer> doubit = e -> e*2;

        //System.out.println(doubit.apply(2));

        Function<Integer,Integer> addit = e -> e+2;

        //System.out.println(addit.apply(2));



        System.out.println("FIrst doubit andthen addit "+ doubit.andThen(addit).apply(4)); //first doubit = 8and addit 8+2 = 10 first f1 then f2

        System.out.println("FIrst doubit andthen addit "+ doubit.compose(addit).apply(4)); // first addit =6 and doubit 6*2 =12 first f2 then f1
        //compose will do first


    }
}
