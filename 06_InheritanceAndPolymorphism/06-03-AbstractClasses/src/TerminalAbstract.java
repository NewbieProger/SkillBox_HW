import accounts.IndividualEntrepreneurs;
import accounts.LegalEntity;
import accounts.NaturalPerson;

public class TerminalAbstract {
    public static void main(String[] args) {
        NaturalPerson naturalPerson = new NaturalPerson();
        naturalPerson.replenish(300);
        System.out.println(naturalPerson.getAccountBalance());
        naturalPerson.showBillInfo();

        System.out.println();

        LegalEntity legalEntity = new LegalEntity();
        legalEntity.replenish(180);
        legalEntity.withdraw(50);
        legalEntity.showBillInfo();

        System.out.println();

        IndividualEntrepreneurs individualEntrepreneurs = new IndividualEntrepreneurs();
        individualEntrepreneurs.replenish(300);
        individualEntrepreneurs.withdraw(120);
        individualEntrepreneurs.showBillInfo();
        individualEntrepreneurs.withdraw(individualEntrepreneurs.getAccountBalance());
        individualEntrepreneurs.replenish(2000);
        individualEntrepreneurs.withdraw(150);
        individualEntrepreneurs.showBillInfo();
    }
}
