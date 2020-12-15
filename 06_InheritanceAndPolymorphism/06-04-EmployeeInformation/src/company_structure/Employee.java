package company_structure;

public interface Employee extends Comparable<Employee> {

    double getMonthSalary();

    void setCompany(Company company);

    void setSalary();

    @Override
    int compareTo(Employee o);
}
