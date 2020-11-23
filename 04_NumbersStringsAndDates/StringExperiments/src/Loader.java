import java.util.ArrayList;
import java.util.List;

public class Loader {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String space = " ";
        List<Integer> spaceIndexes = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            int indexOfSpace = text.indexOf(space, i);

            if (indexOfSpace == -1) {
                break;
            }

            i = indexOfSpace;
            spaceIndexes.add(indexOfSpace);
        }

        int cashVasya = Integer.parseInt((text.substring(spaceIndexes.get(1), spaceIndexes.get(2))).trim());
        int cashPetr = Integer.parseInt(text.substring(spaceIndexes.get(5), spaceIndexes.get(6)).trim());
        int cashMasha = Integer.parseInt(text.substring(spaceIndexes.get(10), spaceIndexes.get(11)).trim());
        int sumFriends = cashVasya + cashPetr + cashMasha;

        System.out.println("Сумма зарплат друзей: " + sumFriends);
    }
}