public class ReverseMassiveMain {
    public static void main(String[] args) {
        String text = "Каждый охотник желает знать, где сидит фазан";

        String[] splittedText = text.split(",?\\s+");

        for (int i = splittedText.length - 1; i >= 0; i--) {
            System.out.println(splittedText[i]);
        }
    }
}
