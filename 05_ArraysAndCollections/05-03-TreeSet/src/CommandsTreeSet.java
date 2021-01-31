import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommandsTreeSet {
    TreeSet<String> emailList = new TreeSet<>();

    private final String regexCommands = "LIST|ADD\\s(\\w+@(GMAIL|MAIL|INBOX)\\.(RU|COM))";

    private final Pattern patternCommands = Pattern.compile(regexCommands);


    public Boolean validateInsertedCommand(String command) {
        Matcher matcherCommands = patternCommands.matcher(command);
        return matcherCommands.matches();
    }

    public void showEmails() {
        if (!emailList.isEmpty()) {
            for (String eachCase : emailList) {
                System.out.println("E-mail: " + eachCase);
            }
        } else System.out.println("Список e-mail'ов пуст.");
    }

    public void addEmail(String email) {
        if (!emailList.contains(email)) {
            emailList.add(email);
            System.out.println(new StringBuilder("E-mail '")
                    .append(email)
                    .append("' добавлен в список."));
        } else {
            System.out.println(new StringBuilder("E-mail '")
            .append(email)
            .append("' уже содержится в списке."));
        }

    }

}
