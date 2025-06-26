package KeywordsAndInstance;

public class BankAccount {
    static String bankName;
    static int totalAccounts;
    String AccountHolderName;
    private final int AccountNumber;

    public BankAccount(int accountNumber) {
        AccountNumber = accountNumber;
        bankName = "SBI";
    }

    public BankAccount(String AccountHolderName, int AccountNumber) {
        this.AccountHolderName = AccountHolderName;
        this.AccountNumber = AccountNumber;
        totalAccounts++;
    }
    public static int getTotalAccounts(){
        return totalAccounts;
    }
    public void displayAccountInfo() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + AccountHolderName);
            System.out.println("Account Number: " + AccountNumber);
        } else {
            System.out.println("Invalid account object.");
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 10101);
        BankAccount acc2 = new BankAccount("Bob", 20202);

        acc1.displayAccountInfo();
        acc2.displayAccountInfo();

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }

}
