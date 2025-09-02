package ticket_booking_cancenling;

class Ticket {}

class TrainTicket extends Ticket {}
class FlightTicket extends Ticket {}
class BusTicket extends Ticket {}

class TicketGenerator {
    public Ticket generateTicket() {
        System.out.println("Generic Ticket Generated");
        return new Ticket();
    }
}

class TrainTicketGenerator extends TicketGenerator {
    @Override
    public TrainTicket generateTicket() {
        System.out.println("Train Ticket Generated");
        return new TrainTicket();
    }
}

class FlightTicketGenerator extends TicketGenerator {
    @Override
    public FlightTicket generateTicket() {
        System.out.println("Flight Ticket Generated");
        return new FlightTicket();
    }
}

class BusTicketGenerator extends TicketGenerator {
    @Override
    public BusTicket generateTicket() {
        System.out.println("Bus Ticket Generated");
        return new BusTicket();
    }
}
