public class MaskingInformation {
    public static void main(String[] args) {

    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {

        if (text.contains("<") && text.contains(">")) {
            int firstBracket = text.indexOf("<");
            int secondBracket = text.indexOf(">") + 1;

            String textBeforeNumber = text.substring(0, firstBracket);
            String numberForDiamonds = text.substring(firstBracket, secondBracket).trim();
            String numberNotForDiamonds = text.substring(secondBracket).trim();

            String replacedNumber = numberForDiamonds.replace(numberForDiamonds, placeholder);

            System.out.println(numberForDiamonds);
            System.out.println(replacedNumber);
            text = textBeforeNumber + replacedNumber + numberNotForDiamonds;

        }

        return text;

    }
}
