package accounts;

public abstract class BankClient {

    protected double accountBalance;
    protected double withdrawCommission;
    protected double replenishCommission;

    public void replenish(double amount) {
        accountBalance += amount + getReplenishCommission(amount);
    }

    public void withdraw(double amount) {
        if (amount >= accountBalance) {
            accountBalance -= amount + getWithdrawCommission(amount);
        } else {
            System.out.println("AccountBalance less then withdraw amount. Your accountBalance is: " + getAccountBalance());
        }
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public abstract void showBillInfo();

    protected double getWithdrawCommission(double withDrawAmount) {
        return withDrawAmount * withdrawCommission;
    }

    protected double getReplenishCommission(double replenishAmount) {
        return replenishAmount * replenishCommission;
    }

}