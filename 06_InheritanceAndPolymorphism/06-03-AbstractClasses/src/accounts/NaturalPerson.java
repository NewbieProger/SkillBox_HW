package accounts;

public class NaturalPerson extends BankClient {

    @Override
    public void showBillInfo() {
        System.out.println("Информация о счёте:\n" +
                "Пополнение и снятие производится без комисии.\n" +
                "Баланс счёта: " +
                getAccountBalance());
    }

}
