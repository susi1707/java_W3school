package Interface;


import java.util.ArrayList;
import java.util.List;

interface Account{
    int deposite(int amt);
    int withdraw(int amt);

    int viewBalance();
}
class bank{
    List<Account> accounts ;

    public bank() {
        this.accounts = new ArrayList<>();
    }

   void  addAccount(Account account){
         accounts.add(account);

    }
    void  withdraw(Account account){
        accounts.remove(account);

    }
    void deposit(Account account1 , int amt){
        account1.deposite(amt);
    }

    void printBlance(){
        for (Account account: accounts ) {
            System.out.println();
        }
    }
}
class savingAccount implements Account{
   int balance;
   int interctRate;

    public savingAccount(int balance) {
        this.balance = balance;
        this.interctRate = interctRate;
    }

    @Override
    public int deposite(int amt) {
        balance =+ amt;
        return balance;
    }

    @Override
    public int withdraw(int amt) {
        balance =-amt;
        return balance;
    }

    @Override
    public int viewBalance() {
        return balance;
    }
}
class currentAccount implements Account{

    @Override
    public int deposite(int amt) {
        return 0;
    }

    @Override
    public int withdraw(int amt) {
        return 0;
    }

    @Override
    public int viewBalance() {
        return 0;
    }
}

public class Q4 {
    public static void main(String[] args) {
        bank bank1 = new bank();
        savingAccount sa = new savingAccount(1000);
        bank1.deposit(sa,100);
        bank1.printBlance();
    }
}
