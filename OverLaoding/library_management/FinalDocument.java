package library_management;

import java.util.Scanner;

public class FinalDocument {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	       PayMant paymant=new PayMant();

	        System.out.println("===== Payment Menu =====");
	        System.out.println("1) Cash Payment");
	        System.out.println("2) UPI Payment");
	        System.out.println("3) Credit Card Payment");
	        System.out.print("Enter your choice [1/2/3]: ");
	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1: 
	                System.out.print("Enter Amount: ");
	                double amount = sc.nextDouble();
	                paymant.makePayment(amount);
	                break;

	            case 2:
	                sc.nextLine(); 
	                System.out.print("Enter UPI ID: ");
	                String upi = sc.nextLine();
	                System.out.print("Enter Amount: ");
	                amount = sc.nextDouble();
	                paymant.makePayment(upi, amount);
	                break;

	            case 3: // Credit Card
	                sc.nextLine(); 
	                System.out.print("Enter Card Holder Name: ");
	                String name = sc.nextLine();
	                System.out.print("Enter 16-digit Credit Card Number: ");
	                String card = sc.nextLine();
	                System.out.print("Enter Amount: ");
	                amount = sc.nextDouble();
	                paymant.makePayment(card, name, amount);
	                break;

	            default:
	                System.out.println("❌ Invalid Choice");
	        }

	        sc.close();

	}

}
