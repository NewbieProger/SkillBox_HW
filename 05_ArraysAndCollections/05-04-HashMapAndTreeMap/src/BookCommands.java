import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BookCommands {

    TreeMap<String, String> phoneBook = new TreeMap<>();

    /*Конвертируем TreeMap в обычный Set, чтобы можно было перебрать*/
    Set<Map.Entry<String, String>> entrySet = phoneBook.entrySet();

    public void setNameAndNumber(String name, String number) {
        phoneBook.put(name, number);
    }

    public void showList() {
        for (Map.Entry<String, String> entries : entrySet) {
            String value = entries.getValue();
            String key = entries.getKey();
            System.out.println(new StringBuilder("Контакт: ")
                    .append(key)
                    .append(" - ")
                    .append(value));
        }
    }

    public void contactCreatedSuccessfully(String inputName, String inputNumber) {
        System.out.println(new StringBuilder("Создан новый контакт: ")
                .append(findName(inputNumber))
                .append(" - ")
                .append(findNumber(inputName)));
    }

    public void contactContainsInBook(String inputName, String whoContains) {
        System.out.println(new StringBuilder("Контакт с таким")
                .append(whoContains)
                .append("уже содержится в телефонной книге: ")
                .append(inputName)
                .append(" - ")
                .append(findNumber(inputName)));
    }

    public Boolean doesBookHasName(String keyName) {
        if (phoneBook.containsKey(keyName)) {
            return true;
        }

        return false;
    }

    public Boolean doesBookHasNumber(String phoneNumber) {
        if (phoneBook.containsValue(phoneNumber)) {
            return true;
        }
        return false;
    }

    public String findName(String number) {
        String name = "";
        for (Map.Entry<String, String> entries : entrySet) {
            if (entries.getValue().equals(number)) {
                name = entries.getKey();
                return name;
            }
        }
        return "Имя не найдено";
    }

    public String findNumber(String name) {
        return phoneBook.get(name);
    }


    public String checkInputData(String inputScanner) {
        if (inputScanner.matches("LIST")) {
            return "LIST";
        } else if (inputScanner.matches("^7.{10}$")) {
            return "NUMBER";
        } else if (inputScanner.matches("^\\D+$")) {
            return "NAME";
        }
        return "WRONG";

    }

    public String castNumber(String inputNumber) {
        String replacedNumber = inputNumber.trim().replaceAll("[\\D]", "")
                .replaceAll("^8", "7");

        boolean countAndStartDigits = replacedNumber.matches("^7.{10}$");
        boolean missedSevenAtStart = replacedNumber.matches("^9.{9}$");

        if (countAndStartDigits) {
            return replacedNumber;
        } else if (missedSevenAtStart) {
            replacedNumber = "7" + replacedNumber;
            return replacedNumber;
        } else {
            return "ERROR";
        }

    }

}
