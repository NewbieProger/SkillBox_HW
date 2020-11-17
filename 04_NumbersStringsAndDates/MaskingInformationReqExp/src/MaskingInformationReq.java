public class MaskingInformationReq {
    public static void main(String[] args) {
        String cardNumber = "Номер кредитной карты <4008 1234 5678> 8912";
        String placeHolder = "***";
        System.out.println("EZ? " + cardNumber.replaceAll("(\\<+.{4}+\\>+)|(\\<+.+\\>+)", placeHolder));
    }
}
