package bankingapplication;


public class BankAccount {
    protected String accountHolder;
    protected String accountNumber;
    protected double balance;
    public static final String IFSC_CODE = "SBIN0070264";

    protected BankAccount(String accountHolder, String accountNumber, double balance) {
        if (accountHolder == null || accountHolder.isBlank()) {
            System.err.println("Account holder name cannot be empty.");
            System.exit(0);
        }
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.err.println("Account number cannot be empty.");
            System.exit(0);
        }
        if (balance < 0) {
            System.err.println("Balance cannot be negative.");
            System.exit(0);
        }
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void calculateInterest() {
        System.out.println("Generic Bank Interest Calculation...");
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance RS : " + balance);
        System.out.println("IFSC CODE : " + IFSC_CODE);
    }
}
