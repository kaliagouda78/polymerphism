package bankingapplication;

public class CurrentAccount extends BankAccount {
    protected double overdraftLimit = 5000.0;

    protected CurrentAccount(String accountHolder, String accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current accounts do not earn interest.");
    }

    public void checkOverdraftLimit() {
        System.out.println("Overdraft limit RS : " + overdraftLimit);
    }
}
