package Hybrid.Vehicle;
class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void refuel() {
        System.out.println("Petrol Vehicle " + model + " is refueling.");
    }
}