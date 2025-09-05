package shoping_mall_application;

public class VIPCustomer extends Customer {
	 protected double discountRate = 15.0; 
	    protected VIPCustomer(String name) {
		super(name);
	}
	    public void calculateBill(double ...price) {
			double sum=0;
				for(double p:price) {
					if(p<0) {
						System.err.println("Item price cannot be negative.");
						System.exit(0);
					}
				 sum=sum+p;
				 
				}
				System.out.println("Welcome to Hyderabad Mall  :");
				System.out.println("Customer :"+name);
				System.out.println("Total cost RS :"+sum);
				System.out.println("Discount RS :"+sum*0.15);
				System.out.println("Final amount RS :"+(sum-(sum*0.15)));
			}
}
