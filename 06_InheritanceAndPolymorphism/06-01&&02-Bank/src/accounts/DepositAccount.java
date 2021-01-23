package accounts;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {

    private LocalDate dateLastDeposit;
    private LocalDate dateNow = LocalDate.now();

    @Override
    public boolean withdraw(Double amount) {
        if (balance >= amount) {
            if (dateNow.isAfter(dateLastDeposit)) {
                super.withdraw(amount);
                return true;
            } else {
                System.out.println("Нельзя производить списания с депозидного счёта ранее, чем через 30 дней после внесения.");
                return false;
            }
        } else {
            System.out.println("Balance less then withdraw amount. Your balance is: " + getBalance());
            return false;
        }
    }

    @Override
    public void deposit(Double amount) {
        super.deposit(amount);
        dateLastDeposit = LocalDate.now().plusDays(30);
    }
}
