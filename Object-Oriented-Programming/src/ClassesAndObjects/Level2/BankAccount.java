package ClassesAndObjects.Level2;

public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public void displayBalance(){
        System.out.println("Current balance is : "+balance);
    }

    public static void main(String[] args) {
        BankAccount a = new BankAccount("Jaguar", 2015, 100);
        a.deposit(1000);
        a.withdraw(2000);
        a.displayBalance();
    }

}
