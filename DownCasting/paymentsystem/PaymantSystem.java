package paymentsystem;
class Payment{
	public void makePayment() {
		System.out.println("payment through generic mathod");
	}
}
class Upi extends Payment{
	public void makePayment() {
		System.out.println("payment through Upi  mathod");
	}
	public void offer() {
		System.out.println("make a payment through get 1000 cash back ");
	}
}
class DebitCard extends Payment{
	public void makePayment() {
		System.out.println("payment through DebitCard  mathod");
	}
}
class CreditCard extends Payment{
	public void makePayment() {
		System.out.println("payment through generic mathod");
	}
	public void offer() {
		System.out.println("make a payment through CreditCard  get 2 day goa trip ");
	}
}
public class PaymantSystem {

	public static void main(String[] args) {
	
		payMantProcess(new CreditCard());
	}
	public static void payMantProcess(Payment pay) {
		CreditCard car=(CreditCard)pay;
		car.makePayment();
		car.offer();
	}

}
