package bankingapplication;

public class FixedDepositAccount extends BankAccount {
    protected double interestRate = 6.5;
    protected int depositTerm;

    protected FixedDepositAccount(String accountHolder, String accountNumber, double balance, int depositTerm) {
        super(accountHolder, accountNumber, balance);
        if (depositTerm <= 0) {
            System.err.println("Deposit term must be positive.");
            System.exit(0);
        }
        this.depositTerm = depositTerm;
    }

    @Override
    public void calculateInterest() {
        double finalAm = (balance * interestRate * depositTerm) / 100;
        System.out.println("Fixed Deposit Interest for " + depositTerm + " years RS : " + finalAm);
    }
}
