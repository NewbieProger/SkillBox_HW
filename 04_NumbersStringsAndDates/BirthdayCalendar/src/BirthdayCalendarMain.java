import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Locale;

public class BirthdayCalendarMain {
    public static void main(String[] args) {

        int day = 18;
        int month = 6;
        int year = 1994;

        collectBirthdays(year, month, day);

    }

//    public static void collectBirthdays(int year, int month, int day) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.DAY_OF_MONTH, day);
//        calendar.set(Calendar.MONTH, month - 1);
//        int currentYear = calendar.get(Calendar.YEAR);
//
//        int age = 0;
//
//        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
//
//        for (int i = year; i <= currentYear; i++) {
//            calendar.set(Calendar.YEAR, i);
//            System.out.println(new StringBuilder().append(age)
//                    .append(" - ")
//                    .append(dateFormat.format(calendar.getTime()))
//                    .append(" - ")
//                    .append(calendar.getDisplayName(calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.US)));
//
//            age++;
//        }
//    }

        public static void collectBirthdays(int year, int month, int day) {

            int currentYear = LocalDate.now().getYear();

            int age = 0;

            DateTimeFormatter formattedDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

            for (int i = year; i <= currentYear; i++) {

                LocalDate birthdayEachYear = LocalDate.of(i, month, day);
                System.out.println();

                System.out.println(new StringBuilder()
                        .append("Возраст: ")
                        .append(age)
                        .append(" - ")
                        .append(formattedDate.format(birthdayEachYear))
                        .append(" - ")
                        .append(birthdayEachYear.getDayOfWeek().toString().substring(0, 3)));

                age++;
            }

    }
}
