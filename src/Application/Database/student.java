package Application.Database;

import java.util.Scanner;

public class student {
    Scanner in = new Scanner(System.in);
    private String firstName;
    private String lasttName;
    private int gradeYear;
    private String studentId;
    private String courses ="";
    private int tuitionBalance;
    private int costOfCourse =600;
    private static int id = 1000;


    //constructor prompt user to enter student's name and year
    public student(){
        System.out.print("Enter the first name: ");
        this.firstName=in.nextLine();
        System.out.print("Enter the last name: ");
        this.lasttName=in.nextLine();
        System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - senior\nEnter student class level ");
        this.gradeYear=in.nextInt();
        setStudentId();
        System.out.println(firstName+" "+ lasttName+" "+gradeYear+" "+studentId);
        
        
    }
    //Set constant increment id
private void setStudentId(){
        id++;
        this.studentId = gradeYear + "" + id;
}
//multiple enroll courses
    public void enroll() {
        System.out.println("Enter course to enroll (Q to quit):");

        while (true) {
            String course = in.next();
            if (course.equalsIgnoreCase("q")) {
                break;
            }
            this.courses  += "\n" + course;
            this.tuitionBalance += costOfCourse;
            System.out.println("Enter another course to enroll (Q to quit):");
        }
        System.out.println("Enrolled In: " + courses);
    }
public void viewBalance(){
    System.out.println("Your Balannce is: $"+ tuitionBalance);
}
public void payTutuion(){
        viewBalance();
    System.out.print("Enter the payment: $");
        int payment = in.nextInt();
        tuitionBalance =tuitionBalance - payment;
    System.out.println("Thanks for the payment: $"+ payment);
    viewBalance();

}

    @Override
    public String toString() {
        return
                "firstName='" + firstName + '\'' +
                ", lasttName='" + lasttName + '\'' +
                ", gradeYear=" + gradeYear +
                ", studentId='" + studentId + '\'' +
                ", tuitionBalance=" + tuitionBalance +
                ", costOfCourse=" + costOfCourse+
        ", courses='" + courses + '\''
                ;
    }
}
