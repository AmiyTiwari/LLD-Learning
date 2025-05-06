import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ParkingSpot> parkingSpots = Arrays.asList(new TwoWheelerParkingSpot(1),
            new TwoWheelerParkingSpot(2),
            new TwoWheelerParkingSpot(3),
            new TwoWheelerParkingSpot(4),
            new TwoWheelerParkingSpot(5),
            new TwoWheelerParkingSpot(6),
            new TwoWheelerParkingSpot(7)
        );
        List<ParkingSpot> parkingSpots1 = Arrays.asList(new FourWheelerParkingSpot(21),
            new FourWheelerParkingSpot(22),
            new FourWheelerParkingSpot(23),
            new FourWheelerParkingSpot(24),
            new FourWheelerParkingSpot(25),
            new FourWheelerParkingSpot(26)
        );

        Vehicle vehicle = new Vehicle(1111, VehicleType.TwoWheeler);
        Vehicle vehicle1 = new Vehicle(1121, VehicleType.TwoWheeler);
        Vehicle vehicle5 = new Vehicle(2112, VehicleType.FourWheeler);

        ParkingManagerFactory parkingManagerFactory = new ParkingManagerFactory(parkingSpots, parkingSpots1); 

        EntranceGate entranceGate1 = new EntranceGate(parkingManagerFactory);
        EntranceGate entranceGate2 = new EntranceGate(parkingManagerFactory);

        ExitGate exitGate1 = new ExitGate();

        System.out.println("Vehicle " + vehicle.number);

        ParkingSpot parkingSpot = entranceGate1.FindParkingSpot(vehicle.type);
        entranceGate1.BookSpot(vehicle, parkingSpot);
        Ticket ticket = entranceGate1.GenerateTicket(1000, vehicle, parkingSpot);

        System.out.println("Vehicle " + vehicle.number + " Entered at 1000 and at spot " + parkingSpot.id);

        System.out.println("Vehicle " + vehicle1.number);

        ParkingSpot parkingSpot1 = entranceGate2.FindParkingSpot(vehicle1.type);
        entranceGate2.BookSpot(vehicle1, parkingSpot1);
        Ticket ticket2 = entranceGate2.GenerateTicket(1010, vehicle1, parkingSpot1);

        System.out.println("Vehicle " + vehicle1.number + " Entered at 1010 and at spot " + parkingSpot1.id);

        System.out.println("Vehicle " + vehicle5.number);

        ParkingSpot parkingSpot2 = entranceGate1.FindParkingSpot(vehicle5.type);
        entranceGate1.BookSpot(vehicle5, parkingSpot2);
        Ticket ticket3 = entranceGate1.GenerateTicket(1030, vehicle5, parkingSpot2);

        System.out.println("Vehicle " + vehicle5.number + " Entered at 1030 and at spot " + parkingSpot2.id);

        System.out.println("Vehicle " + vehicle.number + " Exited at 1100 with cost " + exitGate1.RemoveVehicle(1100, ticket));
        System.out.println("Vehicle " + vehicle1.number + " Exited at 1070 with cost " + exitGate1.RemoveVehicle(1070, ticket2));
        System.out.println("Vehicle " + vehicle5.number + " Exited at 1155 with cost " + exitGate1.RemoveVehicle(1155, ticket3));
    }
}
