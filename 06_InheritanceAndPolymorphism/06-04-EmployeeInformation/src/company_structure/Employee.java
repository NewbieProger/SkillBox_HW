package company_structure;

public interface Employee extends Comparable<Employee> {

    double getMonthSalary();

    void setCompany(Company company);

    void setSalary();

    default int compareTo(Employee o) {
        return Double.compare(getMonthSalary(), o.getMonthSalary());
    }

    int getEmployeeId();

    void setEmployeeId(int employeeId);

    double getProfitForCompany();

}
