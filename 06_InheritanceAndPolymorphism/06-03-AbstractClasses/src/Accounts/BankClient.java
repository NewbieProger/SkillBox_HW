package Accounts;

public abstract class BankClient {

    protected double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount >= balance) {
            balance -= amount;
        } else {
            System.out.println("Balance less then withdraw amount. Your balance is: " + getBalance());
        }
    }

    public double getBalance() {
        return balance;
    }

    public abstract void showBillInfo();

}