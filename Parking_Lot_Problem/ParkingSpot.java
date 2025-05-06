public class ParkingSpot {
    int id;
    boolean isEmpty;
    float price;
    Vehicle vehicle;

    ParkingSpot(int id) {
        this.id = id;
        this.isEmpty = true;
        this.vehicle = null;
        this.price();
        System.out.println(id);
    }

    void ParkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    void RemoveVehicle() {
        this.vehicle = null;
        this.isEmpty = true;
    }

    void price() {
        this.price = 25;
    }
}