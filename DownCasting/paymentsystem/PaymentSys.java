package paymentsystem;

class Payment1 {
 public void makePayment() {
     System.out.println("Generic payment method");
 }
 public void offer() {
     System.out.println("No special offers available.");
 }
}
class Upi1 extends Payment1 {
 @Override
 public void makePayment() {
     System.out.println("UPI payment method");
 }

 @Override
 public void offer() {
     System.out.println("Make a payment through UPI to get 1000 cashback");
 }
}
class DebitCard1 extends Payment1 {
 @Override
 public void makePayment() {
     System.out.println("Debit Card payment method");
 }
}
class CreditCard1 extends Payment1 {
 @Override
 public void makePayment() {
     System.out.println("Credit Card payment method");
 }

 @Override
 public void offer() {
     System.out.println("Make a payment through Credit Card to get a 2-day Goa trip");
 }
}
public class PaymentSys {
 public static void main(String[] args) {
     passObject(new Upi1(), new DebitCard1(), new CreditCard1());
 }

 public static void passObject(Payment1... payments) {
     for (Payment1 p : payments) {
    	 if(p instanceof Upi1){
				Upi1 upi=(Upi1)p;
				upi.makePayment();
				upi.offer();
			}
			else if(p instanceof DebitCard1 debit){
				debit.makePayment();
			}
			else if(p instanceof CreditCard1 credit){
				credit.makePayment();
				credit.offer();
			}
     }
 }
}

