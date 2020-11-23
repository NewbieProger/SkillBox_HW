import java.text.DecimalFormat;

public class Temperatures {

    public static void main(String[] args) {
        int patientCount = 30;
        float[] temperatures = new float[patientCount];
        DecimalFormat df = new DecimalFormat("#.0");
        float sum = 0F;
        int patientNumber = 1;

        float minTemp = 32F;
        float maxTemp = 40F;

        float minHealthyTemp = 36.2F;
        float maxHealthyTemp = 36.9F;

        float averageTemp = 0F;

        int countHealthyPatient = 0;

        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] = (float) (Math.random() * (maxTemp - minTemp) + minTemp);
        }

        for (float patientTemp : temperatures) {
            sum += patientTemp;
        }

        averageTemp = sum / temperatures.length;

        System.out.println("Средняя температура по больнице: " + df.format(averageTemp));
        /*
         * */
        for (float healthyPatient : temperatures) {
            if (minHealthyTemp <= healthyPatient && healthyPatient <= maxHealthyTemp) {
                countHealthyPatient++;
            }
        }
        /*
        * */
        System.out.println("Количество здоровых пациентов: " + countHealthyPatient);

        for (float patientTemp : temperatures) {
            System.out.println(new StringBuilder()
                    .append("Пациент ")
                    .append(patientNumber)
                    .append(" - ")
                    .append((df.format(patientTemp)))
                    .append("°"));
            patientNumber++;
        }



    }
}
