import java.util.Arrays;
import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager {
    FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpots) {
        super(parkingSpots);
        System.out.println("Four Wheeler Manager Constructor Call");
    }

    ParkingSpot FindParkingSpot() {
        System.out.println("Four Wheeler parking spot finding strategy");
        ParkingSpot freeParkingSpot = null;
        int row = 10000;
        int column = -1;
        for (ParkingSpot parkingSpot : parkingspotCollection.values()) {
            if (parkingSpot.isEmpty) {
                System.out.println(parkingSpot.id);
                if (row >= parkingSpot.id/10 && column <= parkingSpot.id%10){
                    row = parkingSpot.id/10;
                    column = parkingSpot.id%10;
                    freeParkingSpot = parkingSpot;
                }
            }
        }

        return freeParkingSpot;
    }
}
