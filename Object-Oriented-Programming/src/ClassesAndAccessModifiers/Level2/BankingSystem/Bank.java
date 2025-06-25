package Level2.BankingSystem;

public class Bank {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount("SB98765", "Saksham Agrawal", 20000.0, 4.5);

        sa.displayAccountInfo();
        sa.deposit(5000);
        sa.withdraw(3000);
        System.out.println("Final Balance: ₹" + sa.getBalance());
    }
}
