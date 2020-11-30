package Accounts;

import org.jetbrains.annotations.NotNull;

public class BankAccount {
    protected Double balance = 0.0;

    public boolean withdraw(Double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Balance less then withdraw amount. Your balance is: " + getBalance());
            return false;
        }
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public Double getBalance() {
        return balance;
    }

    public boolean sendThrowBills(@NotNull BankAccount receiver, double amount) {
        
        if (withdraw(amount)) {
            receiver.deposit(amount);
            return true;
        }

        return false;
    }
}
