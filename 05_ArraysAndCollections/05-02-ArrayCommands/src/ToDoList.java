import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToDoList {

//    private final String regexCommands = "LIST|ADD\\s\\d+\\s.+|ADD\\s.+|EDIT\\s\\d+\\s\\.+|DELETE\\s\\d+|DELETE\\s\\w+";
    private final String regexCommands = "(LIST|ADD|EDIT|DELETE) (\\D+|\\d+|(\\d+) (\\D+))";
    private final Pattern patternCommands = Pattern.compile(regexCommands);
    private List<String> listCases = new ArrayList<>();

    public String getMatcherGroup(String command, int groupIndex) {
        Matcher matcherCommands = patternCommands.matcher(command);
        /*Объясните, почему без следующей строки у меня группы не хочет находить? Я бошку сломал уже*/
        matcherCommands.matches();
        return matcherCommands.group(groupIndex);
    }

    public Boolean isCommandValidated(String command) {
        Matcher matcher = patternCommands.matcher(command);
        if (matcher.matches()) {
            return true;
        }

        return false;
    }

    public int groupCounts(String command) {
        Matcher matcherCommands = patternCommands.matcher(command);
        return matcherCommands.groupCount();
    }

    public void showCases() {
        System.out.println("Дело : № - Название");
        if (!listCases.isEmpty()) {
            for (String eachCase : listCases) {
                System.out.println(new StringBuilder("Дело : ")
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
}
