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


        for ( ; ; ) {
            String scannerCommand = scanner.nextLine();

            String editedCommand = scannerCommand.toUpperCase().trim();

            if (editedCommand.equals("EXIT")) {
                System.out.println("Завершение программы.");
                break;
            }

            if (!Boolean.TRUE.equals(toDoList.isCommandValidated(editedCommand))) {
                System.out.println("Неверная команда. Валидация не прошла.");
                continue;
            }

            Integer groupCount = toDoList.groupCounts(editedCommand);

            switch (toDoList.getMatcherGroup(editedCommand, 1)) {
                case "LIST":
                    toDoList.showCases();
                    break;
                case "ADD":
                    if (!groupCount.equals(4)) {
                        toDoList.addCaseIndexAndName(Integer.parseInt(toDoList.getMatcherGroup(editedCommand, 3)), toDoList.getMatcherGroup(editedCommand, 4));
                    } else {
                        toDoList.addCaseName(toDoList.getMatcherGroup(editedCommand,2));
                    }
                    break;

                case "EDIT":
                    toDoList.editCase(Integer.parseInt(toDoList.getMatcherGroup(editedCommand, 3)), toDoList.getMatcherGroup(editedCommand, 4));
                    break;

                case "DELETE":
                    if (!groupCount.equals(5)) {
                        toDoList.deleteCaseByIndex(Integer.parseInt(toDoList.getMatcherGroup(editedCommand, 3)));
                    } else {
                        toDoList.deleteCaseByName(toDoList.getMatcherGroup(editedCommand,4));
                    }
                    break;
            }
        }
    }
}
