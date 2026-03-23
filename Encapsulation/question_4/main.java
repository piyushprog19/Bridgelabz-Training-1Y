package question_4;
class Main {
    public static void main(String[] args) {
        BankAccount a1 = new SavingsAccount(1, "Piyush", 8000);
        BankAccount a2 = new CurrentAccount(2, "tanmaysir", 15000);

        BankAccount[] accounts = {a1, a2};

        for (BankAccount acc : accounts) {
            acc.deposit(1000);
            acc.withdraw(500);

            double interest = acc.calculateInterest();
            Loanable l = (Loanable) acc;

            System.out.println("Account: " + acc.getHolderName());
            System.out.println("Balance: " + acc.getBalance());
            System.out.println("Interest: " + interest);

            l.applyForLoan(20000);
            System.out.println();
        }
    }
}