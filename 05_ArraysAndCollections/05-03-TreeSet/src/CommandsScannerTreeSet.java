import java.util.Scanner;

public class CommandsScannerTreeSet {
    public static void main(String[] args) {
        System.out.println(new StringBuilder()
                .append("Редактор списка e-mail'ов. Введите необходимую команду:\n")
                .append("LIST - Отобразить список e-mail'ов\n")
                .append("ADD %E-mail в формате 'имя@домен.ru/com'% - Добавить e-mail в список"));

        Scanner scanner = new Scanner(System.in);
        CommandsTreeSet commands = new CommandsTreeSet();


        for (; ; ) {
            String scannerCommand = scanner.nextLine();

            String editedCommand = scannerCommand.toUpperCase().trim();
            Boolean isValidated = commands.validateInsertedCommand(editedCommand);

            if (!isValidated) {
                System.out.println("Неверная команда или вводимый формат e-mail'а.");
                continue;
            }

            String[] splittedCommand = editedCommand.split(" ");

            if (splittedCommand[0].equals("EXIT")) {
                System.out.println("Завершение программы.");
                break;
            }

            switch (splittedCommand[0]) {
                case "LIST":
                    commands.showEmails();
                    break;
                case "ADD":
                    commands.addEmail(splittedCommand[1]);
                    break;
            }
        }
    }
}
