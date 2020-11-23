import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TotalEarningsCalculatorReqExp {
    public static void main(String[] args) {
        String text = "Вася заработал 3 рублей, Петя -  2 рубля, а Маша - 3 рублей";
        String[] splittedText = text.split(" ");
        List<Integer> cashes = new ArrayList<>();

        String regex = "[\\d]";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int sum = 0;

        /*Катимся по массиву и отбираем цифры, пишем их в интовый эррейЛист*/
        for (String text2 : splittedText) {
            if (matcher.find()) {
                cashes.add(Integer.valueOf(matcher.group()));
                }
            }

        /*Катимся по интовому эррейЛисту и суммируем значения*/
        if (!cashes.isEmpty()) {
            for (int value : cashes) {
                sum += value;
            }
        }
        System.out.println(sum);
    }
}
