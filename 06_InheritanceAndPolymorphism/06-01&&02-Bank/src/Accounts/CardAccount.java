package Accounts;

public class CardAccount extends BankAccount {

    private double percent = 0.01;

    @Override
    public boolean withdraw(Double amount) {
        return super.withdraw(amount + amount * percent);
    }
}
