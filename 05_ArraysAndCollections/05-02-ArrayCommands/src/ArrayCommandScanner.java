import java.util.Scanner;

public class ArrayCommandScanner {
    public static void main(String[] args) {
        System.out.println(new StringBuilder()
                .append("Редактор списка дел. Введите необходимую команду:\n")
                .append("LIST - Отобразить список дел\n")
                .append("ADD %Название дела% - Добавить дело в конец списка\n")
                .append("ADD %Номер позиции% %Название дела% - Добавить дело на определённую позицию\n")
                .append("EDIT %Номер позиции% %Новое название дела% - Изменить название дела на определённой позиции\n")
                .append("DELETE %Номер позиции% - Удалить дело по номеру позиции\n")
                .append("EXIT - Выход из программы"));

        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();


        for (; ; ) {
            String scannerCommand = scanner.nextLine();

            String editedCommand = scannerCommand.toUpperCase().trim();

            if (editedCommand.equals("EXIT")) {
                System.out.println("Завершение программы.");
                break;
            }

            if (Boolean.FALSE.equals(toDoList.isCommandValidated(editedCommand))) {
                System.out.println("Неверная команда. Валидация не прошла.");
                continue;
            }


            String regexCommand = toDoList.getMatcherGroup(editedCommand, 1).trim();
            int regexIndex = Integer.parseInt(toDoList.getMatcherGroup(editedCommand, 2).trim());
            String regexNameOfItem = String.valueOf(toDoList.getMatcherGroup(editedCommand, 3)).trim();

            switch (regexCommand) {
                case "LIST":
                    toDoList.showCases();
                    break;
                case "ADD":
                    if (regexIndex != -1) {
                        toDoList.addCaseIndexAndName(regexIndex, regexNameOfItem);
                    } else {
                        toDoList.addCaseName(regexNameOfItem);
                    }
                    break;

                case "EDIT":
                    toDoList.editCase(regexIndex, regexNameOfItem);
                    break;

                case "DELETE":
                    if (regexIndex != -1) {
                        toDoList.deleteCaseByIndex(regexIndex);
                    } else {
                        toDoList.deleteCaseByName(regexNameOfItem);
                    }
                    break;
            }
        }
    }
}
