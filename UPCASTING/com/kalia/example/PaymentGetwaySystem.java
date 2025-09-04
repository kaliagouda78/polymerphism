package com.kalia.example;

class Payment1 {
    public void processPayment() {
        System.out.println("Payment through the generic method");
    }
}

class CreditCardPayment extends Payment1 {
    @Override
    public void processPayment() {
        System.out.println("Payment through the CreditCardPayment method");
    }
}

class DebitCardPayment extends Payment1 {
    @Override
    public void processPayment() {
        System.out.println("Payment through the DebitCardPayment method");
    }
}

class UPIPayment extends Payment1 {
    @Override
    public void processPayment() {
        System.out.println("Payment through the UPIPayment method");
    }
}

public class PaymentGetwaySystem {
    public static void main(String[] args) {
        paymentGateway(new CreditCardPayment(), new DebitCardPayment(), new UPIPayment());
    }

    public static void paymentGateway(Payment1... payments) {
        for (Payment1 payment1 : payments) {
            payment1.processPayment();
        }
    }
}
