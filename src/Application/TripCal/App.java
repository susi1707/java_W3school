package Application.TripCal;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<String> memberList = new ArrayList<>();
        List<Integer> amount = new ArrayList<>();
        LinkedHashMap<String,Integer> totalList = new LinkedHashMap<>();
        LinkedHashMap<String,String> reasonforwithdraw = new LinkedHashMap<>();
        Scanner in = new Scanner(System.in);
        int total_amount=0;
        int remain_bal =0;
        System.out.println("Please Enter number of Members");
        int no_mber = in.nextInt();
        System.out.println("Please enter members name");
        for (int i = 0; i < no_mber; i++) {
            String members = in.next();
            memberList.add(members);
        }
        System.out.println("Please Enter the amount");
        for (int j = 0; j <no_mber ; j++) {
            System.out.print(memberList.get(j) +" - ");
            int amt = in.nextInt();
            amount.add(amt);
            totalList.put(memberList.get(j),amt);
        }
        for (Map.Entry<String,Integer> res: totalList.entrySet()) {
            int mapamt = res.getValue();
            total_amount = total_amount + mapamt;
        }
        System.out.println("Members amount = "+ totalList);
        System.out.println("Total budget amount - " +total_amount);


        System.out.println("If want to withdraw please enter 1");
        String input =in.next();
        if("1".equals(input)) {
            //deduct amount
            System.out.println("Enter the amount to deduct");
            int withdraw = in.nextInt();
            remain_bal = total_amount - withdraw;
            System.out.println("Enter the reason for deduct");
            String reason = in.next();
            reasonforwithdraw.put(reason,String.valueOf(withdraw));
            System.out.println("how do you want to deduct\n" +
                    "By person please enter 2\n" +
                    "By All members please enter 3 ");
            String user_withdraw = in.next();
            if("3".equals(user_withdraw)){
                //Value changing in map
                for (Map.Entry<String, Integer> remain_balance_map : totalList.entrySet()) {
                    remain_balance_map.setValue(remain_balance_map.getValue() - withdraw);}
            }
            if("2".equals(user_withdraw)){
                System.out.println("Please enter the person name");
                String person =in.next();
                for (Map.Entry<String, Integer> remain_balance_map : totalList.entrySet()) {
                    if(remain_balance_map.getKey().equalsIgnoreCase(person)){
                        remain_balance_map.setValue(remain_balance_map.getValue() - withdraw);}
                }}
            //Final Values
            System.out.println("Withdraw amount - " + withdraw);
        }
        System.out.println("Remaining Balance " + remain_bal);
        System.out.println("Remaining Members "+ totalList);
        System.out.println("Reason for withdraw "+reasonforwithdraw);
    }
}

