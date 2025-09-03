package bankingapplication;

public class SavingsAccount extends BankAccount {
    protected double interestRate = 4.0;

    protected SavingsAccount(String accountHolder, String accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }

    @Override
    public void calculateInterest() {
        double finalAm = (balance * interestRate) / 100;
        System.out.println("Savings Account Interest RS : " + finalAm);
    }
}
