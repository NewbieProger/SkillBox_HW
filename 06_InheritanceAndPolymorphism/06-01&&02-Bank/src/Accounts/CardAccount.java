package Accounts;

import org.jetbrains.annotations.NotNull;

public class CardAccount extends BankAccount {

    private double percent = 0.01;

    @Override
    public boolean withdraw(Double amount) {
        if (balance >= amount) {
                balance -= (amount + amount * percent);
                return true;
        } else {
            System.out.println("Balance less then withdraw amount. Your balance is: " + getBalance());
            return false;
        }
    }
}
