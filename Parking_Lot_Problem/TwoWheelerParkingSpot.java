public class TwoWheelerParkingSpot extends ParkingSpot {
    TwoWheelerParkingSpot(int id) {
        super(id);
        System.out.println("Two Wheeler Parking Spot");
        this.price();
    }

    void price() {
        this.price = 20;
    }
}
