package Abstract;

abstract class BankAccountt {
    protected String acc;
    protected double balance;

    public BankAccountt(String acc, double balance) {
        this.acc = acc;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(balance);
    }

    void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println(balance);
        }
    }

    // Additional methods common to all bank accounts can be added here.
}

class SavingsAccount extends BankAccountt {
    public SavingsAccount(String acc, double balance) {
        super(acc, balance);
    }
}

class CurrentAccount extends BankAccountt {
    public CurrentAccount(String acc, double balance) {
        super(acc, balance);
    }

}

public class Q3BankAccount {
    public static void main(String[] args) {
        double ibal, damt, wamt;
        ibal = 1000.00;
        SavingsAccount savingsAccount = new SavingsAccount("SA001", ibal);
        System.out.println("Savings A/c: Initial Balace: $" + ibal);
        damt = 500.00;
        savingsAccount.deposit(damt);
        wamt = 250.00;
        savingsAccount.withdraw(wamt);
        wamt = 1600.00;
        System.out.println("\nTry to withdraw: $" + wamt);
        savingsAccount.withdraw(wamt);

        System.out.println();
        ibal = 5000.00;
        CurrentAccount currentAccount = new CurrentAccount("CA001", ibal);
        System.out.println("Current A/c: Initial Balace: $" + ibal);
        damt = 2500.00;
        currentAccount.deposit(1000.0);
        wamt = 1250.00;
        currentAccount.withdraw(3000.0);
        wamt = 6000.00;
        System.out.println("\nTry to withdraw: $" + wamt);
        savingsAccount.withdraw(wamt);
    }
}
