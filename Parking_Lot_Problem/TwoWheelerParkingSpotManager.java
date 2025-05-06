import java.util.Arrays;
import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager {

    TwoWheelerParkingSpotManager(List<ParkingSpot> parkingSpots) {
        super(parkingSpots);
        System.out.println("Two Wheeler Manager Constructor Call");
    }

    ParkingSpot FindParkingSpot() {
        System.out.println("Two Wheeler parking spot finding strategy");
        ParkingSpot freeParkingSpot = null;
        int id = -1;
        for (ParkingSpot parkingSpot : parkingspotCollection.values()) {
            if (parkingSpot.isEmpty) {
                System.out.println(parkingSpot.id);
                if (id < parkingSpot.id){
                    id = parkingSpot.id;
                    freeParkingSpot = parkingSpot;
                }
            }
        }

        return freeParkingSpot;
    }
}
