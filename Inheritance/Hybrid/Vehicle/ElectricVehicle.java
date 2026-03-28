package Hybrid.Vehicle;
class ElectricVehicle extends Vehicle {

    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println("Electric Vehicle " + model + " is charging.");
    }
}