package question_3;
public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car("C101", "Car", 1000);
        Vehicle v2 = new Bike("B202", "Bike", 500);
        Vehicle v3 = new Truck("T303", "Truck", 2000);

        Vehicle[] vehicles = {v1, v2, v3};

        for (Vehicle v : vehicles) {
            double rent = v.calculateRentalCost(5);
            Insurable i = (Insurable) v;
            double insurance = i.calculateInsurance();

            System.out.println("Vehicle: " + v.getType());
            System.out.println("Rent: " + rent);
            System.out.println("Insurance: " + insurance);
            System.out.println();
        }
    }
}