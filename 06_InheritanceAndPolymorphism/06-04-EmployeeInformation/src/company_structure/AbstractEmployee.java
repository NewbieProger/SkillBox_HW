package company_structure;

public abstract class AbstractEmployee implements Employee {
    protected double empTotalSalary;
    protected double employeeIncome;
    protected double fixedSalary;
    protected int idEmployee;
    protected Company company;

    public AbstractEmployee(double fixedSalary, int idEmployee) {
        this.fixedSalary = fixedSalary;
        this.idEmployee = idEmployee;
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
    public int getIdEmployee() {
        return idEmployee;
    }

    @Override
    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    @Override
    public double getProfitForCompany() {
        return 0;
    }
}