import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double maxContainer = 12;
        double maxBoxes = 27;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Расчёт количества машин и контейнеров. \n Введите количество отправляемых ящиков:");
        int boxesCount = scanner.nextInt();

        int truckNumber = 1;
        int containerNumber = 1;
        double containersCount = boxesCount / maxBoxes;
        double trucksCount = containersCount / maxContainer;
        System.out.println("Грузовиков необходимо: " + (int)Math.ceil(trucksCount));
        System.out.println("Контейнеров необходимо: " + (int)Math.ceil(containersCount));

        for (int boxNumber = 1; boxNumber <= boxesCount; boxNumber++) {

            if (boxNumber % (maxContainer * maxBoxes) == 0 || boxNumber == 1) {
                System.out.println("Грузовик: " + truckNumber);
                truckNumber++;
            }

            if ((boxNumber - 1) % maxBoxes == 0 || boxNumber == 1) {
                System.out.println("\tКонтейнер: " + containerNumber);
                containerNumber++;
            }

            System.out.println("\t\tЯщик: " + boxNumber);

        }


    }

}