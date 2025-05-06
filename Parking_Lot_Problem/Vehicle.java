public class Vehicle {
    int number;
    VehicleType type;

    Vehicle(int number, VehicleType type) {
        System.out.println("Vehicle : Number -> " + number + " Type -> " + type);
        this.number = number;
        this.type = type;
        
    }
}