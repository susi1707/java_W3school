package OOPs;

import java.util.ArrayList;

class Account {
     String name;
     double balance;
     String ac;

    public Account(String name, double balance, String ac) {
        this.name = name;
        this.balance = balance;
        this.ac = ac;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", ac='" + ac + '\'' +
                '}';
    }
}
class Bank{
    Account acc;
    ArrayList<Account> accounts;

    public Bank(Account acc) {
        this.acc = acc;
        this.accounts = new ArrayList<>();
    }

    void addAccount(Account e){
        accounts.add(e);
    }
    void removeAccount(Account e){
        accounts.remove(e);
    }
    Double depoist(Double amt){
        acc.balance += amt;
        return acc.balance;
    }
    Double withdraw(Double amt){
        acc.balance += amt;
        return acc.balance;
    }
    ArrayList<Account> getDetails(){
        return accounts;
    }


}


public class main {


    public static void main(String[] args) {
        Account acc1 = new Account("razor",10,"01");
        Account acc2 = new Account("susi",20,"02");
        Bank bank = new Bank(acc1);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
            for(Account res : bank.getDetails()){
            System.out.println(res);
    }}

}