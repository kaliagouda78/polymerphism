package bankingapplication;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please select the Account Type :");
        System.out.println("1) Saving Account");
        System.out.println("2) Current Account");
        System.out.println("3) Fixed Deposit Account");
        System.out.print("Please enter the type of account you want to open : [1/2/3] ");

        int choice = sc.nextInt();
        sc.nextLine(); 

        switch (choice) {
            case 1 -> {
                System.out.print("Enter account Holder Name : ");
                String sName = sc.nextLine();
                System.out.print("Enter account Number : ");
                String sAccNo = sc.nextLine();
                System.out.print("Enter the Amount : ");
                double sBal = sc.nextDouble();

                SavingsAccount sa = new SavingsAccount(sName, sAccNo, sBal);
                sa.displayAccountDetails();
                sa.calculateInterest();
            }

            case 2 -> {
                System.out.print("Enter account Holder Name : ");
                String cName = sc.nextLine();
                System.out.print("Enter account Number : ");
                String cAccNo = sc.nextLine();
                System.out.print("Enter the Amount : ");
                double cBal = sc.nextDouble();

                CurrentAccount ca = new CurrentAccount(cName, cAccNo, cBal);
                ca.displayAccountDetails();
                ca.calculateInterest();
                ca.checkOverdraftLimit();
            }

            case 3 -> {
                System.out.print("Enter account Holder Name : ");
                String fName = sc.nextLine();
                System.out.print("Enter account Number : ");
                String fAccNo = sc.nextLine();
                System.out.print("Enter the Amount : ");
                double fBal = sc.nextDouble();
                System.out.print("Enter the deposit term [For How many years you want to deposit] : ");
                int term = sc.nextInt();

                FixedDepositAccount fda = new FixedDepositAccount(fName, fAccNo, fBal, term);
                fda.displayAccountDetails();
                fda.calculateInterest();
            }

            default -> System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
