import java.util.Scanner;

public class Main
{
    private static int minIncome = 200000;
    private static int maxIncome = 900000;

    private static int officeRentCharge = 140000;
    private static int telephonyCharge = 12000;
    private static int internetAccessCharge = 7200;

    private static int assistantSalary = 45000;
    private static int financeManagerSalary = 90000;

    private static double mainTaxPercent = 0.24;
    private static double managerPercent = 0.15;

    private static double minInvestmentsAmount = 100000;

    //Выше переменные int - целое число, double - дробное

    public static void main(String[] args)
    {
        while(true) //Цикл while. Проверяет условие true
        {
            System.out.println("Введите сумму доходов компании за месяц " +
                "(от 200 до 900 тысяч рублей): ");
            int income = (new Scanner(System.in)).nextInt(); //Просим юзера ввести через консоль данные

            if(!checkIncomeRange(income)) { //Если метод checkIncomeRange возвращает false цикл запускается по новой
                continue;
            }

            double managerSalary = income * managerPercent; //ЗП менеджера считаем
            double pureIncome = income - managerSalary - calculateFixedCharges(); //Расчет чистого дохода с налогами.
            double taxAmount = mainTaxPercent * pureIncome; //Расчет налогов
            double pureIncomeAfterTax = pureIncome - taxAmount; //Чистый доход минус налоги

            boolean canMakeInvestments = pureIncomeAfterTax >= minInvestmentsAmount; //Можем ли сделать инвистицию

            System.out.println("Зарплата менеджера: " + managerSalary);
            System.out.println("Общая сумма налогов: " +
                (taxAmount > 0 ? taxAmount : 0));
            System.out.println("Компания может инвестировать: " +
                (canMakeInvestments ? "да" : "нет"));
            if(pureIncome < 0) {
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");
            }
        }
    }

    private static boolean checkIncomeRange(int income) //Возвращает тру, если вводимое число в диапазаоне от 200к до 900к
    {
        if(income < minIncome)
        {
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if(income > maxIncome)
        {
            System.out.println("Доход выше верхней границы");
            return false;
        }
        return true;
    }

    private static int calculateFixedCharges()
    {
        return officeRentCharge +
                telephonyCharge +
                internetAccessCharge +
                assistantSalary +
                financeManagerSalary;
    }
}
