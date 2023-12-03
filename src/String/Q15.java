package String;

import java.util.Calendar;

public class Q15 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.format("%tb %tm %tY%n", c,c,c);
        System.out.format("%tr", c);
    }
}
