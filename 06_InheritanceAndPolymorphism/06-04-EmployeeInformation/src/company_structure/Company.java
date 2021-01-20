package company_structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {
    protected double income = 0;

    protected List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getEmployeeList() {
        return employeeList;
    }


    public void hire(Employee employee) {
        employee.setCompany(this);
        employee.setSalary();
        setIncome(getIncome() + employee.getProfitForCompany());
        employeeList.add(employee);
        System.out.println("Один сотрудник нанят: " +
                employee.getClass().getSimpleName() +
                " с зарплатой: $" + employee.getMonthSalary());
    }

    public void hireAll(List<Employee> listEmployees) {
        for (Employee employee : listEmployees) {
            hire(employee);
        }
        System.out.println("Пачка сотрудников нанята.");
    }

    public void fire(int employeeId) {
        if (!employeeList.isEmpty()) {

            employeeList.removeIf(i -> i.getEmployeeId() == employeeId);

            System.out.println("Сотрудник " + employeeId + " уволен.");
        }
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        Collections.sort(employeeList);
        List<Employee> sorted = new ArrayList<>();

        if (sorted.size() > 0 && sorted.size() >= count) {
            return sorted.subList(0, count);
        } else return employeeList;

    }

    public List<Employee> getLowestSalaryStaff(int count) {
        Collections.reverse(employeeList);
        List<Employee> sorted = new ArrayList<>();

        if (count > 0 && count <= employeeList.size()) {
            for (int index = 0; index < count; index++) {
                sorted.add(employeeList.get(index));
            }
            return sorted;
        }
        return employeeList;

    }
}
