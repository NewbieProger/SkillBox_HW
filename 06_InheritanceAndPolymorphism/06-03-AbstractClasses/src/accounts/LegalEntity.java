package accounts;

public class LegalEntity extends BankClient {

    private final double withdrawCommission = 0.01;

    @Override
    public void showBillInfo() {
        System.out.println("Информация о счёте:\n" +
                "Снятие со счёта производится с комиссией: " + withdrawCommission * 100 + "%" +
                "\nБаланс счёта: " +
                getAccountBalance());
    }
}
