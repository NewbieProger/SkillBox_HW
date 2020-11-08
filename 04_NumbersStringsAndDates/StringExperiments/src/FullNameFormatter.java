import java.util.ArrayList;
import java.util.List;

public class FullNameFormatter {
    public static void main(String[] args) {

        String fio = "Иванов Иван Иванович";
        String space = " ";
        List<Integer> spaceIndexes = new ArrayList<>();

        if (FullNameFormatter.isNumber(fio)) {
            for (int i = 0; i < fio.length(); i++) {
                int indexOfSpace = fio.indexOf(space, i);

                if (indexOfSpace == -1) {
                    break;
                }

                i = indexOfSpace;
                spaceIndexes.add(indexOfSpace);

            }

            if (spaceIndexes.size() == 2) {
                System.out.println(
                        "Фамилия: " + fio.substring(0, spaceIndexes.get(0)).trim() + "\n" +
                                "Имя: " + fio.substring(spaceIndexes.get(0), spaceIndexes.get(1)).trim() + "\n" +
                                "Отчество" + fio.substring(spaceIndexes.get(1))
                );
            } else {
                System.out.println("Введенная строка не является ФИО");
            }
        } else System.out.println("Введенная строка не является ФИО");

    }

    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }
}
