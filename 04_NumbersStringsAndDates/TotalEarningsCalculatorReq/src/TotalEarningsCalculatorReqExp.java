import java.util.ArrayList;
import java.util.List;

public class TotalEarningsCalculatorReqExp {
    public static void main(String[] args) {
        String text = "Вася заработал 3 рублей, Петя -  2 рубля, а Маша - 3 рублей";
        String[] splittedText = text.split(" ");
        List<Integer> cashes = new ArrayList<>();
        int sum = 0;

        for (String text2 : splittedText) {
            /*Катимся по массиву и отбираем цифры, пишем их в интовый эррейЛист*/
            if (text2.matches("[\\d]+")) {
                cashes.add(Integer.valueOf(text2));
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
