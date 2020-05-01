import java.math.BigDecimal;
import java.math.RoundingMode;

public class MinMaxValues {
    public static void main(String[] args) {
        String minValueByte = Byte.toString(Byte.MIN_VALUE);
        String maxValueByte = Byte.toString(Byte.MIN_VALUE);

        String minValueInt = Integer.toString(Integer.MAX_VALUE);
        String maxValueInt = Integer.toString(Integer.MIN_VALUE);

        String minValueShort = Short.toString(Short.MIN_VALUE);
        String maxValueShort = Short.toString(Short.MAX_VALUE);

        String minValueLong = Long.toString(Long.MIN_VALUE);
        String maxValueLong = Long.toString(Long.MAX_VALUE);

        String minValueFloat = Float.toString(-Float.MIN_VALUE);
        String maxValueFloat = Float.toString(Float.MAX_VALUE);

        String minValueDouble = Double.toString(-Double.MIN_VALUE);
        String maxValueDouble = Double.toString(Double.MAX_VALUE);


        System.out.println(
                minValueByte + ' ' + '\n' +
                maxValueByte + ' ' + '\n' +
                        minValueInt + ' ' + '\n' +
                        maxValueInt + ' ' + '\n' +
                        minValueShort + ' ' + '\n' +
                        maxValueShort + ' ' + '\n' +
                        minValueLong + ' ' + '\n' +
                        maxValueLong + ' ' + '\n' +
                        minValueFloat + ' ' + '\n' +
                        maxValueFloat + ' ' + '\n' +
                        minValueDouble + ' ' + '\n' +
                        maxValueDouble + '\n'
        );
    }
}
