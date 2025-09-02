package ticket_booking_cancenling;

public class TicketBooking {
    public void cancelTicket(double amount) {
        System.out.println("Generic cancellation. Refund = " + amount);
    }
}

class TrainTicketBooking extends TicketBooking {
    @Override
    public void cancelTicket(double amount) {
        double refund = amount - (amount * 0.10);
        System.out.println("Train Cancellation: Refund = " + refund);
    }
}

class FlightTicketBooking extends TicketBooking {
    @Override
    public void cancelTicket(double amount) {
        double refund = amount - (amount * 0.30);
        System.out.println("Flight Cancellation: Refund = " + refund);
    }
}

class BusTicketBooking extends TicketBooking {
    @Override
    public void cancelTicket(double amount) {
        double refund = amount - (amount * 0.15);
        System.out.println("Bus Cancellation: Refund = " + refund);
    }
}

