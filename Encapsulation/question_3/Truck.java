package question_3;
class Truck extends Vehicle implements Insurable {
    public Truck(String number, String type, double rate) {
        super(number, type, rate);
    }

    double calculateRentalCost(int days) {
        return rentalRate * days * 1.5;
    }

    public double calculateInsurance() {
        return 1000;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance";
    }
}