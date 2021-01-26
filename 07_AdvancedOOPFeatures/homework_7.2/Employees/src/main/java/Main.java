import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Main {

    private static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        Employee employeeMaxSalary = findEmployeeWithHighestSalary(staff, 2017);
        System.out.println(employeeMaxSalary);
    }

    public static LocalDate convertDate(Date inputDate) {

        LocalDate date = LocalDate.ofInstant(inputDate.toInstant(),
                ZoneId.systemDefault());

        return date;
    }

    public static Employee findEmployeeWithHighestSalary(List<Employee> staff, int year) {
        //TODO Метод должен вернуть сотрудника с максимальной зарплатой среди тех,
        // кто пришёл в году, указанном в переменной year

        LocalDate inputDate = LocalDate.of(year, 1, 1);

        LocalDate dateNow = LocalDate.now();

        Employee maxEmployeeSalary = staff.stream()
                .filter(e -> convertDate(e.getWorkStart()).isAfter(inputDate))
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);

        return maxEmployeeSalary;
    }
}