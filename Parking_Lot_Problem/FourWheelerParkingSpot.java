public class FourWheelerParkingSpot extends ParkingSpot {
    FourWheelerParkingSpot(int id) {
        super(id);
        System.out.println("Four Wheeler Parking Spot");
        this.price();
    }

    void price() {
        this.price = 40;
    }
}
