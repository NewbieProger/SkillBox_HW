import Accounts.BankAccount;
import Accounts.CardAccount;
import Accounts.DepositAccount;

import java.util.Calendar;

public class Terminal {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(200.5);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(400.5);
        bankAccount.withdraw(18.5);
        System.out.println(bankAccount.getBalance());

        System.out.println();
        System.out.println("Депозит");
        System.out.println();
        DepositAccount depositAccount = new DepositAccount();
        System.out.println(depositAccount.getBalance());
        depositAccount.deposit(500.0);
        depositAccount.withdraw(600.0);
        depositAccount.withdraw(100.0);
        depositAccount.withdraw(400.0);
        System.out.println(depositAccount.getBalance());

        System.out.println();
        System.out.println("Кард аккаунт");
        System.out.println();
        CardAccount cardAccount = new CardAccount();
        System.out.println(cardAccount.getBalance());
        cardAccount.deposit(500.0);
        cardAccount.withdraw(1600.0);
        cardAccount.withdraw(400.0);
        System.out.println(cardAccount.getBalance());

        /*Переводы*/
        System.out.println();
        System.out.println("Переводы:");
        System.out.println();
        /*С обычного счета, на депозитный*/
        bankAccount.sendThrowBills(depositAccount, 10);
        System.out.println("Кард");

        cardAccount.sendThrowBills(bankAccount, 100);
        System.out.println();

        /*С депозитного на обычный*/
        depositAccount.sendThrowBills(bankAccount, 100.0);
    }
}
