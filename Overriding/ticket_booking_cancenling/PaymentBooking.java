package ticket_booking_cancenling;

class PaymentBooking {
    public void book() {
        login();
        selectTicket();
        makePayment();   // overridden
        confirm();
    }

    public void login() {
        System.out.println("Login Successful");
    }

    public void selectTicket() {
        System.out.println("Ticket Selected");
    }

    public void makePayment() {
        System.out.println("Generic Payment Method");
    }

    public void confirm() {
        System.out.println("Booking Confirmed");
    }
}

class TrainPayment extends PaymentBooking {
    @Override
    public void makePayment() {
        System.out.println("Payment via NetBanking/UPI for Train Ticket");
    }
}

class FlightPayment extends PaymentBooking {
    @Override
    public void makePayment() {
        System.out.println("Payment via Credit/Debit Card for Flight Ticket");
    }
}

class BusPayment extends PaymentBooking {
    @Override
    public void makePayment() {
        System.out.println("Payment via Wallet for Bus Ticket");
    }
}
