package question_4;
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    double calculateInterest() {
        return balance * 0.04;
    }

    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan Approved: " + amount);
        } else {
            System.out.println("Loan Denied");
        }
    }

    public boolean calculateLoanEligibility() {
        return balance > 5000;
    }
}