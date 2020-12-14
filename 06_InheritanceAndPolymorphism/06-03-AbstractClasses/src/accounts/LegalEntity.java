package accounts;

public class LegalEntity extends BankClient {

    private final double withdrawCommission = 0.01;

    @Override
    public void withdraw(double amount) {
        this.accountBalance -= (amount + getWithdrawCommission(amount));
    }

    @Override
    public void showBillInfo() {
        System.out.println("Информация о счёте:\n" +
                "Снятие со счёта производится с комиссией: " + withdrawCommission * 100 + "%" +
                "\nБаланс счёта: " +
                getAccountBalance());
    }

    @Override
    protected double getWithdrawCommission(double withDrawAmount) {
        return withDrawAmount * this.withdrawCommission;
    }

    @Override
    protected double getReplenishCommission(double replenishAmount) {
        return replenishAmount * this.replenishCommission;
    }
}
