package company_structure;

public class TopManager extends AbstractEmployee {

    public TopManager(double fixedSalary, int employeeId) {
        super(fixedSalary, employeeId);
    }

    @Override
    public void setSalary() {
        double companyIncome = company.getIncome();

        if (companyIncome > 10_000_000) {
            empTotalSalary = fixedSalary + fixedSalary * 1.5;
        } else {
            empTotalSalary = fixedSalary;
        }
    }
}
