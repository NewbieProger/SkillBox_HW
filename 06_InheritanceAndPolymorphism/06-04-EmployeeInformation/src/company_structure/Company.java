package company_structure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company implements Employee {

    protected double empTotalSalary;
    protected double employeeProfit;
    protected double totalProfit;
    protected List<Company> companyList = new ArrayList<>();

    @Override
    public double getMonthSalary() {
        return empTotalSalary;
    }

    public List<Company> getCompanyList() {
        return companyList;
    }

    public void hire(Company company) {
        companyList.add(company);
        System.out.println("Один сотрудник нанят");
    }

    public void hireAll(List<Company> listEmployees) {
        companyList.addAll(listEmployees);
        System.out.println("Пачка сотрудников нанята.");
    }

    public void fire() {
        if (!companyList.isEmpty()) {
            companyList.remove(companyList.size() - 1);
            System.out.println("Сотрудник уволен.");
        }
    }

    public void getIncome() {
        System.out.println("Общий доход равен: " + totalProfit);
    }

    public void getTopSalaryStaff(int count) {
//        Collections.sort(companyList);
        companyList.sort((Comparator.comparingDouble(Company::getMonthSalary)));

        if (count > 0 && count <= companyList.size()) {
            for (int index = 0; index < count; index++) {
                System.out.println(companyList.get(index).getMonthSalary());
            }
        } else {
            System.out.println("Задаваемый размер не входит в диапазон количества сотрудников.");
        }

//        return companyList;
    }


    public void getLowestSalaryStaff(int count) {
//        Collections.sort(companyList);
            companyList.sort((o1, o2) -> (int) (o2.getMonthSalary() - o1.getMonthSalary()));
//        return companyList;

        if (count > 0 && count <= companyList.size()) {
            for (int index = 0; index < count; index++) {
                System.out.println(companyList.get(index).getMonthSalary());
            }
        } else {
            System.out.println("Задаваемый размер не входит в диапазон количества сотрудников.");
        }

    }
}
