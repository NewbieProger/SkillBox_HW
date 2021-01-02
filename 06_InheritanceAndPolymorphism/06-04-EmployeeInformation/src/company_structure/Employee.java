package company_structure;

public interface Employee extends Comparable<Employee> {

    double getMonthSalary();

    void setCompany(Company company);

    void setSalary();

    default int compareTo(Employee o) {
        return Double.compare(getMonthSalary(), o.getMonthSalary());
    }

    int getIdEmployee();

    void setIdEmployee(int idEmployee);

    double getProfitForCompany();

}
