package company_structure;

public class Manager extends AbstractEmployee {

    public Manager(double fixedSalary, int idEmployee) {
        super(fixedSalary, idEmployee);
    }

    @Override
    public void setSalary() {
        employeeIncome = (Math.random() * 25000) + 115000;
        empTotalSalary = fixedSalary + 0.05 * employeeIncome;

        double companyIncome = company.getIncome();
        company.setTotalIncome(companyIncome += employeeIncome);
    }

}
