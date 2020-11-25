import java.text.DecimalFormat;
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {
        int patientCount = 30;
        float[] temperatures = new float[patientCount];
        DecimalFormat df = new DecimalFormat("#.0");

        setPatientTemperatures(temperatures);
        /*
         * */
        System.out.println("Средняя температура по больнице: " + averageTemperature(temperatures, df));
        /*
         * */
        System.out.println("Количество здоровых пациентов: " + getHealthyPatientsCount(temperatures));

        showAllPatients(temperatures, df);

    }

    private static String averageTemperature(float[] temperatures, DecimalFormat df) {
        float averageTemp;
        float sum = 0F;

        for (float patientTemp : temperatures) {
            sum += patientTemp;
        }

        averageTemp = sum / temperatures.length;

        return df.format(averageTemp);
    }

    private static int getHealthyPatientsCount(float[] temperatures) {

        float minHealthyTemp = 36.2F;
        float maxHealthyTemp = 36.9F;
        int countHealthyPatient = 0;

        for (float healthyPatient : temperatures) {
            if (minHealthyTemp <= healthyPatient && healthyPatient <= maxHealthyTemp) {
                countHealthyPatient++;
            }
        }

        return countHealthyPatient;
    }

    private static void showAllPatients(float[] patients, DecimalFormat df) {

        int patientNumber = 1;

        for (float patientTemp : patients) {
            System.out.println(new StringBuilder()
                    .append("Пациент ")
                    .append(patientNumber)
                    .append(" - ")
                    .append((df.format(patientTemp)))
                    .append("°"));
            patientNumber++;
        }
    }

    private static float[] setPatientTemperatures(float[] temperatures) {
        float minTemp = 32F;
        float maxTemp = 40F;

        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] = (float) (Math.random() * (maxTemp - minTemp) + minTemp);
        }

        return temperatures;
    }

}
