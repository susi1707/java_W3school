package interview.easyLevel;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
@FunctionalInterface
interface multi{
    public int multiple(int a,int b);
}
public class MultipleFunctionalInter {
    public static void main(String[] args) {
     multi mu= (a,b) -> a*b;
        System.out.println(mu.multiple(5,2));
    }
}
