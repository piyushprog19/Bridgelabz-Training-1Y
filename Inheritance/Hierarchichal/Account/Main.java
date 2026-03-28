package Hierarchichal.Account;
public class Main {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount(101, 5000, 4.5);
        CheckingAccount c = new CheckingAccount(102, 8000, 2000);
        FixedDepositAccount f = new FixedDepositAccount(103, 10000, 12);

        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}