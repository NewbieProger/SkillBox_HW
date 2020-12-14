package accounts;

public class NaturalPerson extends BankClient {

    @Override
    public void showBillInfo() {
        System.out.println("Информация о счёте:\n" +
                "Пополнение и снятие производится без комисии.\n" +
                "Баланс счёта: " +
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
