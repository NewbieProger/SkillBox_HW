import java.util.Scanner;

public class CommandsScanner {
    public static void main(String[] args) {
        System.out.println(new StringBuilder()
                .append("Редактор списка дел. Введите необходимую команду:\n")
                .append("LIST - Отобразить список дел\n")
                .append("ADD %Название дела% - Добавить дело в конец списка\n")
                .append("ADD %Номер позиции% %Название дела% - Добавить дело на определённую позицию\n")
                .append("EDIT %Номер позиции% %Новое название дела% - Изменить название дела на определённой позиции\n")
                .append("DELETE %Номер позиции% - Удалить дело по номеру позиции"));

        Scanner scanner = new Scanner(System.in);
        Commands commands = new Commands();


        for ( ; ; ) {
            String scannerCommand = scanner.nextLine();

            String editedCommand = scannerCommand.toUpperCase().trim();
            Boolean isValidated = commands.validateInsertedCommand(editedCommand);

            if (!isValidated) {
                System.out.println("Неверная команда.");
                continue;
            }

            String[] splittedCommand = editedCommand.split(" ");

            if (splittedCommand[0].equals("EXIT")) {
                System.out.println("Завершение программы.");
                break;
            }

            switch (splittedCommand[0]) {
                case "LIST":
                    commands.showCases();
                    break;
                case "ADD":
                    if (splittedCommand.length == 2) {
                        commands.addCaseName(splittedCommand[1]);
                    }
                    if (splittedCommand.length == 3) {
                        commands.addCaseIndexAndName(Integer.parseInt(splittedCommand[1]), splittedCommand[2]);
                    }
                    break;
                case "EDIT":
                    commands.editCase(Integer.parseInt(splittedCommand[1]), splittedCommand[2]);
                    break;
                case "DELETE":
                    if (splittedCommand[1].matches("[\\d]") && !splittedCommand[1].matches("ALL$")) {
                        commands.deleteCaseByIndex(Integer.parseInt(splittedCommand[1]));
                    } else if (!splittedCommand[1].matches("ALL$")) {
                        commands.deleteCaseByName(splittedCommand[1]);
                    } else {
                        commands.deleteAllCases();
                    }
                    break;
            }
        }
    }
}
