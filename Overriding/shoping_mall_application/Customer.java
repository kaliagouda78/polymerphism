package shoping_mall_application;

public class Customer {
protected String name;

protected Customer(String name) {
	super();
	if(name.isEmpty()||name.equals(null)) {
		System.err.println("enter a velid name");
		System.exit(0);
	}
	this.name = name;
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
