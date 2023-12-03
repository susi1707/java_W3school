package Application.Database;

import OOPs.Student;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {


        System.out.print("Pleaase enroll the new student ");
        Scanner in = new Scanner(System.in);
        int num_of_student = in.nextInt();
        student students[] = new student[num_of_student];

        for (int i = 0; i < num_of_student; i++) {
            students[i] = new student();
            students[i].enroll();
            students[i].payTutuion();
        }
        for (int j = 0; j < num_of_student; j++) {
            System.out.println(students[j].toString());

        }
    }
}
