import Enums.InputType;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;

import static Enums.InputType.*;


public class BookCommands {

    TreeMap<String, String> phoneBook = new TreeMap<>();

    /*Конвертируем TreeMap в обычный Set, чтобы можно было перебрать*/
    Set<Map.Entry<String, String>> entrySet = phoneBook.entrySet();

    public void setNameAndNumber(String name, String number) {
        phoneBook.put(name, number);
    }

    public void showList() {
        for (Map.Entry<String, String> entries : entrySet) {
            System.out.println(new StringBuilder("Контакт: ")
                    .append(entries.getKey())
                    .append(" - ")
                    .append(entries.getValue()));
        }
    }

    public void contactCreatedSuccessfully(String inputName, String inputNumber) {
        System.out.println(new StringBuilder("Создан новый контакт: ")
                .append(findName(inputNumber).get())
                .append(" - ")
                .append(findNumber(inputName)));
    }

    public void contactContainsInBook(String inputName, String whoContains) {
        System.out.println(new StringBuilder("Контакт с таким ")
                .append(whoContains)
                .append("уже содержится в телефонной книге: ")
                .append(inputName)
                .append(" - ")
                .append(findNumber(inputName)));
    }

    public boolean doesBookHasName(String keyName) {
        return phoneBook.containsKey(keyName);
    }

    public boolean doesBookHasNumber(String phoneNumber) {
        return phoneBook.containsValue(phoneNumber);
    }

    public Optional<String> findName(String number) {
        String name = "";
        for (Map.Entry<String, String> entries : entrySet) {
            if (entries.getValue().equals(number)) {
                name = entries.getKey();
            }
        }
        return Optional.ofNullable(name);
    }

    public String findNumber(String name) {
        return phoneBook.get(name);
    }


    public InputType checkInputData(String inputScanner) {
        if (inputScanner.matches("LIST")) {
            return LIST;
        } else if (inputScanner.matches("^7.{10}$")) {
            return NUMBER;
        } else if (inputScanner.matches("^\\D+$")) {
            return NAME;
        }
        return WRONG;
    }

    public Optional<String> formatNumber(String inputNumber) {
        String replacedNumber = inputNumber.trim().replaceAll("[\\D]", "")
                .replaceAll("^8", "7");

        boolean countAndStartDigits = replacedNumber.matches("^7.{10}$");
        boolean missedSevenAtStart = replacedNumber.matches("^9.{9}$");

        if (countAndStartDigits) {
            return Optional.of(replacedNumber);
        } else if (missedSevenAtStart) {
            replacedNumber = "7" + replacedNumber;
            return Optional.of(replacedNumber);
        }

        return Optional.empty();
    }

}
