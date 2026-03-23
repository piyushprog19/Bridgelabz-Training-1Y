package question_3;
 class Car extends Vehicle implements Insurable {
    public Car(String number, String type, double rate) {
        super(number, type, rate);
    }

    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return 500;
    }

    public String getInsuranceDetails() {
        return "Car Insurance";
    }
}