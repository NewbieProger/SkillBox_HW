package company_structure;

public class Manager extends AbstractEmployee {

    public Manager(double fixedSalary, int employeeId) {
        super(fixedSalary, employeeId);
    }

    @Override
    public void setSalary() {
        employeeIncome = (Math.random() * 25000) + 115000;
        empTotalSalary = fixedSalary + 0.05 * employeeIncome;
    }

}
