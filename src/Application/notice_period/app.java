package Application.notice_period;

import java.time.LocalDate;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        String datePattern = "\\d{4}-\\d{1,2}-\\d{1,2}";
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the date format should be YYYY-MM-DD");
        String date = in.nextLine();
        if(date.matches(datePattern)){
            LocalDate givenDate = LocalDate.parse(date);
            System.out.println("Notice period days");
            Long noticePeriod = (long)in.nextInt();
            LocalDate minus =  givenDate.plusDays(noticePeriod);
            System.out.printf("%1$s %2$tB %2$td, %2$tY", "Notice Period end:", minus);
        } else {
            System.out.println("pattern not match");
        }

    }

}
