package Hybrid.Vehicle;
public class Main {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla", 200);
        PetrolVehicle pv = new PetrolVehicle("Honda", 180);

        ev.charge();
        pv.refuel();
    }
}