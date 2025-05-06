public class EntranceGate {
    ParkingManagerFactory parkingManagerFactory;
    ParkingSpotManager parkingSpotManager;
    Ticket ticket;

    EntranceGate(ParkingManagerFactory parkingManagerFactory) {
        this.parkingManagerFactory = parkingManagerFactory;
        System.out.println("Entrance Gate Constructor Call");
    }

    ParkingSpot FindParkingSpot(VehicleType type) {
        this.parkingSpotManager = this.parkingManagerFactory.GetParkingSpotManager(type);
        System.out.println("Vehice Type : " + type);
        if (this.parkingSpotManager != null) {
            System.out.println("Finding " + type + " parking spot");
            ParkingSpot parkingSpot = this.parkingSpotManager.FindParkingSpot();

            if (parkingSpot != null) {
                System.out.println("Parking Spot : ID -> " + parkingSpot.id + " Price -> " + parkingSpot.price + " IsEmpty -> " + parkingSpot.isEmpty);
                return parkingSpot;
            }

            return null;
        }

        return null;
    }

    void BookSpot(Vehicle vehicle, ParkingSpot parkingSpot) {
        parkingSpot.ParkVehicle(vehicle);
    }

    Ticket GenerateTicket(long time, Vehicle vehicle, ParkingSpot parkingSpot) {
        return new Ticket(time, vehicle, parkingSpot);
    }
}
