import company_structure.Company;
import company_structure.Employee;
import company_structure.Manager;
import company_structure.TopManager;

import java.util.List;

public class HRDepartment {
    public static void main(String[] args) {

        Company company = new Company();
        System.out.println();

        company.hire(new Manager(654));
        System.out.println();
        company.hire(new Manager(768));


        company.hire(new TopManager(123));
        company.hire(new TopManager(345));
        company.hire(new TopManager(543));
        company.hire(new TopManager(654));
        company.hire(new TopManager(76543));
        company.hire(new TopManager(6548));
        company.hire(new Manager(98));
        company.hire(new TopManager(4213));
        company.hire(new TopManager(16));
        company.hire(new Manager(346));
        company.hire(new TopManager(4574613));

        System.out.println();


        System.out.println();


        for (Employee qwe : company.getEmployeeList()) {
            System.out.println(qwe.getMonthSalary());
        }

        System.out.println();

        company.getLowestSalaryStaff(4);
        System.out.println();
        company.getTopSalaryStaff(4);

        System.out.println();

        company.fire();
        for (Employee employee : company.getEmployeeList()) {
            System.out.println(employee.getMonthSalary());
        }

        System.out.println();

        List<Employee> employees = company.getTopSalaryStaff(6);
        for (Employee employee : employees) {
            System.out.println(employee.getMonthSalary());
        }


        System.out.println();

        List<Employee> employeesReverse = company.getLowestSalaryStaff(6);
        for (Employee employee : employeesReverse) {
            System.out.println(employee.getMonthSalary());
        }

        System.out.println();

        System.out.println(company.getIncome());
    }
}
