import java.util.Arrays;
import java.util.List;

public class ParkingManagerFactory {
    TwoWheelerParkingSpotManager twoWheelerParkingSpotManager;
    FourWheelerParkingSpotManager fourWheelerParkingSpotManager;

    ParkingManagerFactory(List<ParkingSpot> parkingSpots, List<ParkingSpot> parkingSpots1) {
        this.twoWheelerParkingSpotManager = new TwoWheelerParkingSpotManager(parkingSpots);
        this.fourWheelerParkingSpotManager = new FourWheelerParkingSpotManager(parkingSpots1);
        System.out.println("Two Wheeler spot manager and spot count " + parkingSpots.size());
        System.out.println("Four Wheelerspot manager aand spot count " + parkingSpots1.size());
    }

    ParkingSpotManager GetParkingSpotManager(VehicleType type) {
        if (type == VehicleType.TwoWheeler) {
            System.out.println("Two Wheeler");
            return twoWheelerParkingSpotManager;
        }
        else if (type == VehicleType.FourWheeler) {
            System.out.println("Four Wheeler");
            return fourWheelerParkingSpotManager;
        }
        else {
            return null;
        }
    }
}
