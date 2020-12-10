package company_structure;

public class TopManager extends Company implements Employee {
    public TopManager(int fixedSalary) {

        if (totalProfit > 10_000_000) {
            empTotalSalary = fixedSalary + fixedSalary * 1.5;
        } else {
            empTotalSalary = fixedSalary;
        }

    }
}
