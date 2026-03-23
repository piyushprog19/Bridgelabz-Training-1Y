package question_3;
class Bike extends Vehicle implements Insurable {
    public Bike(String number, String type, double rate) {
        super(number, type, rate);
    }

    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return 200;
    }

    public String getInsuranceDetails() {
        return "Bike Insurance";
    }
}