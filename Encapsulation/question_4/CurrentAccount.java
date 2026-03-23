package question_4;
class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    double calculateInterest() {
        return 0;
    }

    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan Approved: " + amount);
        } else {
            System.out.println("Loan Denied");
        }
    }

    public boolean calculateLoanEligibility() {
        return balance > 10000;
    }
}