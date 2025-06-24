package Level2.BankingSystem;

public class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountInfo() {
        System.out.println("Savings Account Info:");
        System.out.println("Account Number: " + accountNumber);    // public access
        System.out.println("Account Holder: " + accountHolder);    // protected access
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

