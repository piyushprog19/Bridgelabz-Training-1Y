package problem_1.MultiVehicle;
public class Main {
    public static void main(String[] args) {
        vehicle v1 = new car();
        vehicle v2 = new Bike();
        vehicle v3 = new Bus();

        v1.rent();
        v1.returnVehicle();

        v2.rent();
        v2.returnVehicle();

        v3.rent();
        v3.returnVehicle();
    }
}