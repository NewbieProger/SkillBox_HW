package Accounts;

public class LegalEntity extends BankClient {

    private double withdrawPercent = 0.01;

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= (amount + amount * withdrawPercent);
    }

    @Override
    public void showBillInfo() {
        System.out.println("Информация о счёте:\n" +
                "Снятие со счёта производится с комиссией: " + withdrawPercent * 100 + "%"+
                "\nБаланс счёта: " +
                getBalance());
    }
}
