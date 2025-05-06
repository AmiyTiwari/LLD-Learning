public class ExitGate {
    ExitGate() {
        System.out.println("Exit Gate Constructor Call");
    }
    float RemoveVehicle(long exitTime, Ticket ticket) {
        ticket.parkingSpot.RemoveVehicle();
        return this.CalculatePrice(ticket.entryTime, exitTime, ticket.parkingSpot.price);
    }

    float CalculatePrice (long entryTime, long exitTime, float price) {
        return (price*((exitTime - entryTime + 59) / 60));
    }
}
