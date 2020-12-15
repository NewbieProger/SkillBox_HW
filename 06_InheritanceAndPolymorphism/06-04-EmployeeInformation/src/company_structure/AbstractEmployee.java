package company_structure;

public abstract class AbstractEmployee implements Employee {
    protected double empTotalSalary;
    protected double employeeIncome;
    protected double fixedSalary;
    protected Company company;

    public AbstractEmployee(double fixedSalary) {
        this.fixedSalary = fixedSalary;
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
    public int compareTo(Employee o) {
        return Double.compare(getMonthSalary(), o.getMonthSalary());
    }
}
