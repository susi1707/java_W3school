package Application.TripCal;

import java.util.*;

public class chatGPT {

    private static Scanner in = new Scanner(System.in);
    private static LinkedHashMap<String, Integer> memberBalances = new LinkedHashMap<>();
    private static LinkedHashMap<String, String> reasonForWithdrawal = new LinkedHashMap<>();
    private static int totalAmount = 0;

    public static void main(String[] args) {
        getInputForMembers();
        showMemberBalances();
        if (askForWithdrawal()) {
            processWithdrawal();
            showRemainingBalance();
            showReasonsForWithdrawal();
        }
    }

    private static void getInputForMembers() {
        System.out.println("Please Enter number of Members:");
        int numMembers = in.nextInt();
        in.nextLine();  // Consume newline left-over

        for (int i = 0; i < numMembers; i++) {
            System.out.println("Enter member " + (i + 1) + " name:");
            String member = in.nextLine();

            System.out.println(member + " - Enter the amount:");
            int amount = in.nextInt();
            in.nextLine();

            memberBalances.put(member, amount);
            totalAmount += amount;
        }
    }

    private static void showMemberBalances() {
        System.out.println("Members amount = " + memberBalances);
        System.out.println("Total budget amount - " + totalAmount);
    }

    private static boolean askForWithdrawal() {
        System.out.println("If you want to withdraw please enter 1, else any key to exit:");
        return "1".equals(in.nextLine());
    }

    private static void processWithdrawal() {
        System.out.println("Enter the amount to deduct:");
        int withdraw = in.nextInt();
        in.nextLine();

        System.out.println("Enter the reason for the deduction:");
        String reason = in.nextLine();
        reasonForWithdrawal.put(reason, String.valueOf(withdraw));

        System.out.println("How do you want to deduct?\n1. By person\n2. By All members");
        int choice = in.nextInt();
        in.nextLine();

        if (choice == 2) {
            deductFromAll(withdraw);
        } else if (choice == 1) {
            deductFromSingle(withdraw);
        }
    }

    private static void deductFromAll(int amount) {
        for (String key : memberBalances.keySet()) {
            memberBalances.put(key, memberBalances.get(key) - amount);
        }
        totalAmount -= amount * memberBalances.size();
    }

    private static void deductFromSingle(int amount) {
        System.out.println("Please enter the person's name:");
        String person = in.nextLine();
        if (memberBalances.containsKey(person)) {
            memberBalances.put(person, memberBalances.get(person) - amount);
            totalAmount -= amount;
        } else {
            System.out.println("Member not found.");
        }
    }

    private static void showRemainingBalance() {
        System.out.println("Remaining Total: " + totalAmount);
        System.out.println("Remaining Members Balances: " + memberBalances);
    }

    private static void showReasonsForWithdrawal() {
        System.out.println("Reasons for withdrawal: " + reasonForWithdrawal);
    }
}
