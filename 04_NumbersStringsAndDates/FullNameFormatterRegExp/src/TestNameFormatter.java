import java.util.Scanner;

public class TestNameFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }

            if (input.matches("^[А-Яа-я-]+\\s[А-Яа-я-]+\\s[А-Яа-я]+$")) {
                String[] splitText = input.split(" ");
                System.out.println("Фамилия: " + splitText[0].trim() + "\r\n" +
                        "Имя: " + splitText[1].trim() + "\r\n" +
                        "Отчество: " + splitText[2].trim());

            } else System.out.println("Введенная строка не является ФИО");
        }
    }
}
