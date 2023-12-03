package lambda;

interface Calculator{
    int sum(int a, int b);
}

public class Q1Calculator {
    public static void main(String[] args) {
        Calculator res = (x,y) -> x+y;
        System.out.println(res.sum(5,5));
    }
}
