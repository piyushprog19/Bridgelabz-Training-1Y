package problem_4.Payment;
class Stripe implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Stripe");
    }
}