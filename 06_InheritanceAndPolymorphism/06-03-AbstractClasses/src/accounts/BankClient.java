package accounts;

public abstract class BankClient {

    protected double accountBalance = 0;
    protected double withdrawCommission = 0;
    protected double replenishCommission = 0;

    public void replenish(double amount) {
        this.accountBalance += amount + getReplenishCommission(amount);
    }

    public void withdraw(double amount) {
        if (amount >= accountBalance) {
            this.accountBalance -= amount + getWithdrawCommission(amount);
        } else {
            System.out.println("AccountBalance less then withdraw amount. Your accountBalance is: " + this.getAccountBalance());
        }
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public abstract void showBillInfo();

    protected abstract double getWithdrawCommission(double withDrawAmount);

    protected abstract double getReplenishCommission(double withDrawAmount);

}