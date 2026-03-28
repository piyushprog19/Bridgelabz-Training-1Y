package problem_4.Payment;
class Paypal implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}

