package shoping_mall_application;

import java.util.Scanner;

public class ShoppingMall {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" Please select the Customer Type to get additional Discount :\r\n"
			+ "		 1) General Customer \r\n"
			+ "		 2) Prime Customer \r\n"
			+ "		 3) VIP Customer ");
	int choice=sc.nextInt();
	sc.nextLine();
	System.out.print("Enter Customer name :");
	String name=sc.nextLine();
	System.out.print("Enter number of Items :");
	int itemNumber=sc.nextInt();
	sc.nextLine();
	Customer cust=switch(choice) 
	{
	case 1->new GeneralCustomer(name);
	case 2->new PrimeCustomer(name);
	case 3->new VIPCustomer(name);
	 default ->new Customer(name);
	};
	  int c=1;
		double prices[]=new double[itemNumber];
		for(int i=0;i<itemNumber;i++) {
			System.out.print(c+")Item Name :");
			String itemName=sc.nextLine();
			System.out.print(c+"Item Price :");
			double price=sc.nextDouble();
			sc.nextLine();
			c++;
			prices[i]=price;
	}
	generateBill(cust,prices);
	sc.close();
	}
	
public static void generateBill(Customer  customer,double []prices) {
    
	
	customer.calculateBill(prices);
}
}
