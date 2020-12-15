package company_structure;

import java.util.*;

public class Company {
    protected double income = 0;

    protected List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getEmployeeList() {
        return employeeList;
    }


    public void hire(Employee employee) {
        employee.setCompany(this);
        employee.setSalary();
        employeeList.add(employee);
        System.out.println("Один сотрудник нанят: " +
                employee.getClass().getSimpleName() +
                " с зарплатой: $" + employee.getMonthSalary());
    }

    public void hireAll(List<Employee> listEmployees) {
        employeeList.addAll(listEmployees);
        System.out.println("Пачка сотрудников нанята.");
    }

    public void fire() {
        if (!employeeList.isEmpty()) {
            employeeList.remove(employeeList.size() - 1);
            System.out.println("Сотрудник уволен.");
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

        if (count > 0 && count <= employeeList.size()) {
            for (int index = 0; index < count; index++) {
                sorted.add(employeeList.get(index));
            }
            return sorted;
        }
        return employeeList;
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

    public void setTotalIncome(double income) {
        this.income = income;
    }
}
