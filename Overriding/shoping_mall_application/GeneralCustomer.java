package shoping_mall_application;

public class GeneralCustomer extends Customer {

	protected GeneralCustomer(String name) {
		super(name);
		
			}
	public void calculateBill(double ...price) {
		double sum=0;
			for(double p:price) {
				if(p<0) {
					System.out.println("price should not be negetive");
					System.exit(0);
				}
			 sum=sum+p;
			 
			}
			System.out.println("Welcome to Hyderabad Mall  :");
			System.out.println("Customer :"+name);
			System.out.println("Total cost RS :"+sum);
			System.out.println("Discount: No discount for general customers.");
		}

}
