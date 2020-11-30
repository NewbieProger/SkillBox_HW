import Accounts.BankAccount;
import Accounts.CardAccount;
import Accounts.DepositAccount;

public class Terminal {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.getBalance();
        bankAccount.deposit(200.5);
        bankAccount.getBalance();
        bankAccount.withdraw(400.5);
        bankAccount.withdraw(18.5);
        bankAccount.getBalance();

        System.out.println();

        DepositAccount depositAccount = new DepositAccount();
        depositAccount.getBalance();
        depositAccount.deposit(500.0);
        depositAccount.withdraw(600.0);
        depositAccount.withdraw(100.0);
        depositAccount.withdraw(400.0);
        depositAccount.getBalance();

        System.out.println();

        CardAccount cardAccount = new CardAccount();
        cardAccount.getBalance();
        cardAccount.deposit(500.0);
        cardAccount.withdraw(1600.0);
        cardAccount.withdraw(400.0);
        cardAccount.getBalance();

        /*Переводы*/
        System.out.println();
        System.out.println("Переводы");
        System.out.println();
        /*С обычного счета, на депозитный*/
        bankAccount.sendThrowBills(depositAccount, 10);

        /*С депозитного на обычный*/
        depositAccount.sendThrowBills(bankAccount, 100.0);
    }
}
