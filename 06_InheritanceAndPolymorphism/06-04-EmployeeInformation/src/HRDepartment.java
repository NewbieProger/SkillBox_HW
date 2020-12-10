import company_structure.Company;
import company_structure.Manager;
import company_structure.Operator;
import company_structure.TopManager;

public class HRDepartment {
    public static void main(String[] args) {

        Company company = new Company();
        company.hire(new TopManager(123));
        company.hire(new Manager(567));
        company.hire(new Operator(345));
        company.hire(new Operator(12421));
        company.hire(new Operator(4543));
        company.hire(new Operator(657657));
        company.hire(new Operator(14));
        company.hire(new Operator(3242));
        company.hire(new Operator(546546));
        company.hire(new Operator(45757));
        company.hire(new Operator(457547));

        company.getTopSalaryStaff(5);
        System.out.println();
        company.getLowestSalaryStaff(8);

    }
}
