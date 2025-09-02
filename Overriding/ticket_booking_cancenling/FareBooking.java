package ticket_booking_cancenling;

public class FareBooking {
    public double calculateFare(double baseFare) {
        return baseFare;
    }
}

class TrainFare extends FareBooking {
    @Override
    public double calculateFare(double baseFare) {
        return baseFare + (baseFare * 0.05);
    }
}

class FlightFare extends FareBooking {
    @Override
    public double calculateFare(double baseFare) {
        return baseFare + (baseFare * 0.18);
    }
}

class BusFare extends FareBooking {
    @Override
    public double calculateFare(double baseFare) {
        return baseFare + (baseFare * 0.08);
    }
}

