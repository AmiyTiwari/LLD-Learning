import java.util.*;

public class ParkingSpotManager {
    Map<Integer, ParkingSpot> parkingspotCollection = new HashMap<Integer, ParkingSpot>();

    ParkingSpotManager(List<ParkingSpot> parkingspotCollection) {
        for (ParkingSpot parkingspot : parkingspotCollection) {
            System.out.println("Spot Id : " + parkingspot.id);
            this.parkingspotCollection.put(parkingspot.id, parkingspot);
        }
    }

    ParkingSpot FindParkingSpot() {
        System.out.println("General parking spot finding strategy");
        for (ParkingSpot parkingSpot : parkingspotCollection.values()) {
            if (parkingSpot.isEmpty) {
                return parkingSpot;
            }
        }

        return null;
    }

    void AddParkingSpot(ParkingSpot parkingspot) {
        this.parkingspotCollection.put(parkingspot.id, parkingspot);
    }

    void AddParkingSpot(List<ParkingSpot> parkingspots) {
        for (ParkingSpot parkingspot : parkingspots) {
            this.parkingspotCollection.put(parkingspot.id, parkingspot);
        }
    }

    void Removeparkingspot(ParkingSpot parkingspot) {
        this.parkingspotCollection.remove(parkingspot.id);
    }

    void ParkVehicle(int id, Vehicle vehicle) {
        ParkingSpot parkingspot = this.parkingspotCollection.get(id);
        parkingspot.ParkVehicle(vehicle);
    }

    void RemoveVehicle(int id) {
        ParkingSpot parkingspot = this.parkingspotCollection.get(id);
        parkingspot.RemoveVehicle();
    }
}
