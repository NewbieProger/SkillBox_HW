import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapPhoneBookCommands {

    TreeMap<String, Integer> phoneBook = new TreeMap<>();

    /*Конвертируем TreeMap в обычный Set, чтобы можно было перебрать*/
    Set<Map.Entry<String, Integer>> entrySet = phoneBook.entrySet();

    public void setNameAndNumber(String name, Integer number) {
        phoneBook.put(name, number);
    }

    public Boolean doesBookHasName(String keyName) {
        if (phoneBook.containsKey(keyName)) {
            System.out.println(new StringBuilder("Пользователь с именем '")
                    .append(keyName)
                    .append("' уже содержится в телефонной книге."));
        }

        return true;
    }

    public Boolean doesBookHasNumber(Integer phoneNumber) {
        if (phoneBook.containsValue(phoneNumber)) {
            System.out.println(new StringBuilder("Данный номер уже указан для пользователя '")
                    .append(phoneBook.get(phoneNumber)));
        }

        return true;
    }

    public String showInfoByNumber(Integer number) {
        String name = "";
        for (Map.Entry<String, Integer> entries : entrySet) {
            if (entries.getValue().equals(number)) {
                name = entries.getKey();
                return name;
            }
        }
        return name;
    }

    public Integer showInfoByName(String name) {
        return phoneBook.get(name);
    }

    public String castNumber(String inputNumber) {
        String replacedNumber = inputNumber.trim().replaceAll("[\\D]", "")
                .replaceAll("^8", "7");

        boolean countAndStartDigits = replacedNumber.matches("^7.{10}$");
        boolean missedSevenAtStart = replacedNumber.matches("^9.{9}$");

        if (missedSevenAtStart) {
            replacedNumber = "7" + replacedNumber;
        }

        if (countAndStartDigits) {
            System.out.println(replacedNumber);
        } else if (missedSevenAtStart) {
            System.out.println("7" + replacedNumber);
        } else System.out.println("Неверный формат номера");

        return replacedNumber;
    }

}
