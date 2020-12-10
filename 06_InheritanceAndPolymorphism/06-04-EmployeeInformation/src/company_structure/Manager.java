package company_structure;

public class Manager extends Company {

    public Manager(int fixedSalary) {
        employeeProfit = (Math.random() * 25000) + 115000;
        totalProfit += employeeProfit;

        empTotalSalary = fixedSalary + 0.05 * employeeProfit;
    }
}
