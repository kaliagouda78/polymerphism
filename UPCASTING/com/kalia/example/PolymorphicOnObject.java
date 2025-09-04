package com.kalia.example;

import java.util.Scanner;

class Payment {
    public void makePayment() {
        System.out.println("Generic payment");
    }
}

class UPI extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment through UPI");
    }
}

class DebitCard extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment through Debit Card");
    }
}

class CreditCard extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment through Credit Card");
    }
}

public class PolymorphicOnObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Debit Card");
        System.out.println("3. Credit Card");
        System.out.println("4. Generic Payment");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        	Payment p = switch (choice) {
            case 1 -> new UPI();
            case 2 -> new DebitCard();
            case 3 -> new CreditCard();
            case 4 -> new Payment();
            default -> {
                System.out.println("Invalid choice, defaulting to Generic Payment.");
                yield new Payment();
            }
        };

        ThroughPayment(p);

        sc.close();
    }

    public static void ThroughPayment(Payment payment) {
        payment.makePayment();
    }
}
