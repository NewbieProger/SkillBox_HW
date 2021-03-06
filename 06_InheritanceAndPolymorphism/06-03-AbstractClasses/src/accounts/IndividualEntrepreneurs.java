package accounts;

public class IndividualEntrepreneurs extends BankClient {

    private final double withdrawCommissionLess = 0.01;
    private final double withdrawCommissionMore = 0.05;

    @Override
    public void showBillInfo() {
        System.out.println("Информация о счёте:\n" +
                "Пополнение счёта производится с комиссией: " +
                "\n- Если сумма пополнения менее $1000: " + withdrawCommissionLess * 100 + "%"+
                "\n- Если сумма пополнения равна или более $1000: " + withdrawCommissionMore * 100 + "%"+
                "\nБаланс счёта: " +
                getAccountBalance());
    }

    @Override
    protected double getReplenishCommission(double replenishAmount) {
        if (replenishAmount < 1000) {
            return replenishAmount * withdrawCommissionLess;
        } else {
            return replenishAmount * withdrawCommissionMore;
        }
    }
}
