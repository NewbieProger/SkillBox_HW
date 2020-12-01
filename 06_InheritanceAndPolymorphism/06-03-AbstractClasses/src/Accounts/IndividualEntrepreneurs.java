package Accounts;

public class IndividualEntrepreneurs extends BankClient {

    private double withdrawPercentLess = 0.01;
    private double withdrawPercentMore = 0.05;

    @Override
    public void deposit(double amount) {
        if (amount < 1000) {
            balance += (amount + amount * withdrawPercentLess);
        } else {
            balance += (amount + amount * withdrawPercentMore);
        }
    }

    @Override
    public void showBillInfo() {
        System.out.println("Информация о счёте:\n" +
                "Пополнение счёта производится с комиссией: " +
                "\n- Если сумма пополнения менее $1000: " + withdrawPercentLess * 100 + "%"+
                "\n- Если сумма пополнения равна или более $1000: " + withdrawPercentMore * 100 + "%"+
                "\nБаланс счёта: " +
                getBalance());
    }
}
