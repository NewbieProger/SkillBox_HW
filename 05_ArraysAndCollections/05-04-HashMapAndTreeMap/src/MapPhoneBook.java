import java.util.Scanner;

public class MapPhoneBook {
    public static void main(String[] args) {

        Scanner scannerCode = new Scanner(System.in);
        MapPhoneBookCommands mapPhoneBookCommands = new MapPhoneBookCommands();

        System.out.println(new StringBuilder()
                .append("Телефонная книга. Укажите команду.\n")
                .append("NAME - Указать имя контакта\n")
                .append("PHONE - Указть номер телефона\n")
                .append("LIST - Отобразить список контактов")
                .append("EXIT - Выход"));
//                .append("ADD %Номер позиции% %Название дела% - Добавить дело на определённую позицию\n")
//                .append("EDIT %Номер позиции% %Новое название дела% - Изменить название дела на определённой позиции\n")
//                .append("DELETE %Номер позиции% - Удалить дело по номеру позиции"));
//

        for ( ; ; ) {

            String inputCode = scannerCode.nextLine().toUpperCase();
            String inputNumber = "";

            switch (inputCode) {
                case "NAME":
                    Scanner scannerName = new Scanner(System.in);
                    String inputName = scannerName.nextLine();

                    if (!mapPhoneBookCommands.doesBookHasName(inputName)) {
                        System.out.println("Введите номер телефона для пользователя: " + inputName);
                        Scanner scannerNumber = new Scanner(System.in);
                        inputNumber = scannerNumber.nextLine();
                        inputNumber = mapPhoneBookCommands.castNumber(inputNumber);

                        mapPhoneBookCommands.setNameAndNumber(inputName, Integer.valueOf(inputNumber));
                    } else {
                        System.out.println(new StringBuilder("Контакт с таким именем уже содержится в телефонной книге: ")
                        .append(mapPhoneBookCommands.showInfoByName(inputName))
                        .append(" - ")
                        .append(mapPhoneBookCommands.showInfoByNumber(Integer.valueOf(inputNumber))));
                    }
                case "PHONE":
                case "LIST":
            }




            if (scannerCode.equals("EXIT")) {
                break;
            }
        }
    }
}
