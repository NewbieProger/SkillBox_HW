import Enums.InputType;

import java.util.Scanner;

public class MapPhoneBook {
    public static void main(String[] args) {

        Scanner scannerStart = new Scanner(System.in);
        BookCommands bookCommands = new BookCommands();
        System.out.println(new StringBuilder("Телефонная книга."));

        for (; ; ) {
            System.out.println(new StringBuilder()
                    .append("\nУкажите имя, номер контакта, 'LIST' для отображения телефонной книги или 'EXIT' для выхода из программы."));

            String inputStart = scannerStart.nextLine().toUpperCase();
            String inputNumber;
            String inputName;

            if (inputStart.equals("EXIT")) {
                break;
            }

            if (bookCommands.formatNumber(inputStart).isPresent()) {
                inputStart = bookCommands.formatNumber(inputStart).get();
            }

            InputType inputType = bookCommands.checkInputData(inputStart);

            switch (inputType) {
                case NAME:
                    inputName = inputStart;

                    if (!bookCommands.doesBookHasName(inputName)) {
                        System.out.println("Введите номер телефона для пользователя: " + inputName);
                        Scanner scannerNumber = new Scanner(System.in);
                        inputNumber = scannerNumber.nextLine();
                        inputNumber = bookCommands.formatNumber(inputNumber).orElse("Не удалось отформатировать введённый номер.");

                        if (!inputNumber.equals("ERROR")) {
                            bookCommands.setNameAndNumber(inputName, inputNumber);

                            bookCommands.contactCreatedSuccessfully(inputName, inputNumber);
                        } else {
                            System.out.println("Неверный формат номера. Повторите попытку.");
                        }

                    } else {
                        bookCommands.contactContainsInBook(inputName, "именем");
                    }
                    break;
                case NUMBER:
                    inputNumber = inputStart;

                    if (!bookCommands.doesBookHasNumber(inputNumber)) {
                        System.out.println("Введите имя пользователя для номера телефона: " + inputNumber);
                        Scanner scannerName = new Scanner(System.in);
                        inputName = scannerName.nextLine().trim();

                        bookCommands.setNameAndNumber(inputName, inputNumber);

                        bookCommands.contactCreatedSuccessfully(inputName, inputNumber);

                    } else {
                        inputName = bookCommands.findName(inputNumber).orElse("Имя не найдено.");

                        bookCommands.contactContainsInBook(inputName, "номером");
                    }
                    break;
                case LIST:
                    bookCommands.showList();
                    break;
                case WRONG:
                    System.out.println("Введённые данные не распознаны");
                    break;
            }
        }
    }
}
