package company_structure;

public abstract class AbstractEmployee implements Employee {
    protected double empTotalSalary;
    protected double employeeIncome;
    protected double fixedSalary;
    protected int employeeId;
    protected Company company;

    public AbstractEmployee(double fixedSalary, int employeeId) {
        this.fixedSalary = fixedSalary;
        this.employeeId = employeeId;
    }

    @Override
    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        return empTotalSalary;
    }

    @Override
    public void setSalary() {
        empTotalSalary = fixedSalary;
    }

    @Override
    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public double getProfitForCompany() {
        return 0;
    }
}