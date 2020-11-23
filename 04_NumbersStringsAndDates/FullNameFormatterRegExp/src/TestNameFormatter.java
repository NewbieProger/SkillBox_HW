import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestNameFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }

            String regex = "([А-Яа-я-]+) ([А-Яа-я-]+) ([А-Яа-я-]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            /*Исходная мною реализация, по ТЗ*/
//            if (matcher.matches()) {
//                String[] splitText = input.split(" ");
//                System.out.println("Фамилия: " + splitText[0].trim() + "\r\n" +
//                        "Имя: " + splitText[1].trim() + "\r\n" +
//                        "Отчество: " + splitText[2].trim());
//
//            } else System.out.println("Введенная строка не является ФИО");

            if (matcher.matches()) {
                System.out.println(new StringBuilder("Фамилия: ")
                        .append(matcher.group(1) + "\n")
                        .append("Имя: ")
                        .append(matcher.group(2) + "\n")
                        .append("Отчество: ")
                        .append(matcher.group(3)));

            } else System.out.println("Введенная строка не является ФИО");
        }
    }
}
