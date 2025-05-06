public class Ticket {
    public long entryTime;
    Vehicle vehicle;
    ParkingSpot parkingSpot;

    Ticket(long entryTime, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.SetEntryTime(entryTime);
        this.SetVehicle(vehicle);
        this.SetParkingSpot(parkingSpot);
    }

    long GetEntryTime() {
        return this.entryTime;
    }

    void SetEntryTime(long time) {
        this.entryTime = time;
    }

    Vehicle GetVehicle() {
        return vehicle;
    }

    void SetVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    ParkingSpot GetParkingSpot() {
        return this.parkingSpot;
    }

    void SetParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
