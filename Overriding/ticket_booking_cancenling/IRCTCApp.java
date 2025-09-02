package ticket_booking_cancenling;

import java.util.Scanner;
public class IRCTCApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to IRCTC Booking System ===");
        System.out.println("Choose Service: 1. Train  2. Flight  3. Bus");
        int choice = sc.nextInt();

        // Object references
        TicketBooking cancelObj = null;
        FareBooking fareObj = null;
        TicketGenerator ticketObj = null;
        PaymentBooking paymentObj = null;

        switch (choice) {
            case 1:
                cancelObj = new TrainTicketBooking();
                fareObj = new TrainFare();
                ticketObj = new TrainTicketGenerator();
                paymentObj = new TrainPayment();
                System.out.println("\n--- You selected Train Booking ---");
                break;

            case 2:
                cancelObj = new FlightTicketBooking();
                fareObj = new FlightFare();
                ticketObj = new FlightTicketGenerator();
                paymentObj = new FlightPayment();
                System.out.println("\n--- You selected Flight Booking ---");
                break;

            case 3:
                cancelObj = new BusTicketBooking();
                fareObj = new BusFare();
                ticketObj = new BusTicketGenerator();
                paymentObj = new BusPayment();
                System.out.println("\n--- You selected Bus Booking ---");
                break;

            default:
                System.out.println("Invalid choice! Exiting...");
                sc.close();
                return;
        }

        // Menu for actions
        System.out.println("\nChoose Action:");
        System.out.println("1. Fare Calculation");
        System.out.println("2. Ticket Generation");
        System.out.println("3. Payment");
        System.out.println("4. Cancel Ticket");
        int action = sc.nextInt();

        switch (action) {
            case 1:
                System.out.print("Enter Base Fare: ");
                double baseFare = sc.nextDouble();
                System.out.println("Final Fare: " + fareObj.calculateFare(baseFare));
                break;

            case 2:
                ticketObj.generateTicket();
                break;

            case 3:
                paymentObj.book();
                break;

            case 4:
                System.out.print("Enter Amount Paid: ");
                double amount = sc.nextDouble();
                cancelObj.cancelTicket(amount);
                break;

            default:
                System.out.println("Invalid Action!");
        }

        sc.close();
    }
}
