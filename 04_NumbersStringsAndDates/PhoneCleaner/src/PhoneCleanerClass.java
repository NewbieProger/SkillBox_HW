import java.util.Scanner;

public class PhoneCleanerClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            String replacedNumber = input.trim().replaceAll("[\\D]", "")
                    .replaceAll("^8", "7");

            boolean countAndStartDigits = replacedNumber.matches("^7.{10}$");
            boolean missedSevenAtStart = replacedNumber.matches("^9.{9}$");

            if (countAndStartDigits) {
                System.out.println(replacedNumber);
            } else if (missedSevenAtStart) {
                System.out.println("7" + replacedNumber);
            } else System.out.println("Неверный формат номера");
        }
    }
}