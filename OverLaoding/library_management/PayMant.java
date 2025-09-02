package library_management;

public class PayMant {
	
	private boolean validateCashPayment(double amount) {
	    if (amount <= 0) {
	        System.err.println("Error: Amount must be greater than zero.");
	        return false;
	    }
	    return true;
	}

     private boolean validateUpiId(String upiId) {
	    if (upiId == null || upiId.trim().isEmpty()) {
	        System.err.println("Error: UPI ID cannot be empty.");
	        return false;
	    }
          if (!upiId.contains("@")) {
	        System.err.println("Error: Invalid UPI ID. Missing '@'.");
	        return false;
	    }
	    String[] parts = upiId.split("@");
	    if (parts.length != 2 || parts[0].isEmpty() || parts[1].isEmpty()) {
	        System.err.println("Error: Invalid UPI ID format. Use username@bank.");
	        return false;
	    }
        if (upiId.contains(" ")) {
	        System.err.println("Error: UPI ID cannot contain spaces.");
	        return false;
	    }
           if (!upiId.matches("^[a-zA-Z0-9._-]{2,256}@[a-zA-Z]{2,64}$")) {
	        System.err.println("Error: Invalid UPI ID format.");
	        return false;
	    }

	    return true;
	}
 
     private boolean validateCreditCard(String cardNumber) {
         if (cardNumber == null || cardNumber.length() != 16) {
             System.err.println("Error: Invalid card number. It must be exactly 16 digits.");
             return false;
         }
         if (!cardNumber.matches("\\d{16}")) {
             System.err.println("Error: Card number must contain only digits.");
             return false;
         }
         return true;
     }

     public void makePayment(double amount) {
    	 if(validateCashPayment(amount)) {
    		 System.out.println("Payment successful via Cash");
    		   System.out.println("Amount Paid: Rs." + amount);
               System.out.println("Payment Successful ✅");
    	 }
    	 
     }
  public void makePayment(String upiId, double amount) {
	  if(validateCashPayment(amount)&& validateUpiId(upiId)) {
		  System.out.println("Payment successful via Credit Card");
		  System.out.println("UPI ID: " + upiId);
          System.out.println("Amount Paid: Rs." + amount);
          System.out.println("Payment Successful ✅");
	  }
    	 
     }
  public void makePayment(String cardHolderName, String cardNumber, double amount) {
 	 if(validateCashPayment(amount)&& validateCreditCard(cardNumber)) {
 		 System.out.println("Payment successful via Credit Card");
 		System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card Number: ****-****-****-" + cardNumber.substring(12));
        System.out.println("Amount Paid: Rs." + amount);
        System.out.println("Payment Successful ✅");
 	 }
  }

}
