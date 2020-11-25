public class ReverseMassiveMain {
    public static void main(String[] args) {
        String text = "Каждый охотник желает знать, где сидит фазан";

        String[] splittedText = text.split(",?\\s+");

        splittedText = reverseMassive(splittedText);

        showMassive(splittedText);

    }

    public static String[] reverseMassive(String[] text) {
        int lastIndex = text.length - 1;
        String[] reversedMassive = new String[text.length];
        int j = reversedMassive.length - 1;

        for (int i = 0; i <= lastIndex; i++) {
            reversedMassive[i] = text[j];
            j--;
        }

        return reversedMassive;
    }

    public static void showMassive(String[] text) {
        for (String eachElement : text) {
            System.out.println(eachElement);
        }
    }
}
