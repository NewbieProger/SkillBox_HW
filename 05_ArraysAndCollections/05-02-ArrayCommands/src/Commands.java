import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Commands {

    private final String regexCommands = "LIST|ADD\\s\\d+\\s.+|ADD\\s.+|EDIT\\s\\d+\\s\\.+|DELETE\\s\\d+|DELETE\\s\\w+";
    private final Pattern patternCommands = Pattern.compile(regexCommands);
    List<String> listCases = new ArrayList<>();

    public Boolean validateInsertedCommand(String command) {
        Matcher matcherCommands = patternCommands.matcher(command);
        return matcherCommands.matches();
    }

    public void showCases() {
        if (!listCases.isEmpty()) {
            for (String eachCase : listCases) {
                System.out.println(new StringBuilder("Дело (№ - Название): ")
                        .append(listCases.indexOf(eachCase))
                        .append(" - ")
                        .append(eachCase));
            }
        } else System.out.println("Список дел пуст.");
    }

    public void addCaseName(String caseName) {
        listCases.add(caseName);
        System.out.println(new StringBuilder("Дело '")
                .append(caseName)
                .append("' добавлено в список"));
    }

    public void addCaseIndexAndName(int caseIndex, String caseName) {
        if (caseIndex > listCases.size()) {
            System.out.println("Невозможно добавить дело. Указываемый номер дела больше размера списка дел.");
        } else {
            listCases.add(caseIndex, caseName);
            System.out.println(new StringBuilder("Дело '")
                    .append(caseName)
                    .append("' добавлено в список"));
        }
    }

    public void editCase(int caseIndex, String caseName) {
        if (caseIndex < listCases.size() && caseIndex >= 0) {
            listCases.set(caseIndex, caseName);
            System.out.println(new StringBuilder("Название дела с номером: ")
                    .append(caseIndex)
                    .append(" изменено на: ")
                    .append(listCases.get(caseIndex)));
        } else {
            System.out.println("Дело с данным номером отсутствует.");
        }
    }

    public void deleteCaseByIndex(int caseIndex) {
        if (caseIndex < listCases.size() && caseIndex >= 0) {
            String removingCaseName = listCases.get(caseIndex);
            listCases.remove(caseIndex);
            System.out.println(new StringBuilder("Дело ")
                    .append("'")
                    .append(caseIndex)
                    .append(" - ")
                    .append(removingCaseName)
                    .append("'")
                    .append(" успешно удалено."));
        } else {
            System.out.println("Дело с данным номером отсутствует.");
        }
    }

    public void deleteCaseByName(String caseName) {
        if (!listCases.isEmpty()) {

            int indexRemoving = listCases.indexOf(caseName);

            if (indexRemoving != -1) {
                String removingCaseName = listCases.get(indexRemoving);
                listCases.remove(indexRemoving);
                System.out.println(new StringBuilder("Дело ")
                        .append("'")
                        .append(indexRemoving)
                        .append(" - ")
                        .append(removingCaseName)
                        .append("'")
                        .append(" успешно удалено."));
            } else {
                System.out.println("Дело с указанным названием отсутствует");
            }
        }
    }

    public void deleteAllCases() {
            while (listCases.size() != 0) {
                listCases.clear();
            }

            System.out.println("Список дел очищен.");
    }
}
