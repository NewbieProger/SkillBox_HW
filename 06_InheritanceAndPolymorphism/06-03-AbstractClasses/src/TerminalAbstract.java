import Accounts.IndividualEntrepreneurs;
import Accounts.LegalEntity;
import Accounts.NaturalPerson;

public class TerminalAbstract {
    public static void main(String[] args) {
        NaturalPerson naturalPerson = new NaturalPerson();
        naturalPerson.deposit(300);
        System.out.println(naturalPerson.getBalance());
        naturalPerson.showBillInfo();

        System.out.println();

        LegalEntity legalEntity = new LegalEntity();
        legalEntity.deposit(180);
        legalEntity.withdraw(50);
        legalEntity.showBillInfo();

        System.out.println();

        IndividualEntrepreneurs individualEntrepreneurs = new IndividualEntrepreneurs();
        individualEntrepreneurs.deposit(300);
        individualEntrepreneurs.withdraw(120);
        individualEntrepreneurs.showBillInfo();
    }
}
