import java.util.*;

public class MainSort {
    public static void main(String[] args) {

//        String randomizedRegion = "";
//        String randomizedNumber = "";

        String[] numbers = {"000", "111", "222", "333", "444", "555", "666", "777", "888", "999"};

        String[] letters = {"С", "М", "Т", "В", "А", "Р", "О", "Н", "Е", "У"};

        HashSet<String> listHash = new HashSet<>();

        /*Первичное решение через рандомайзер. Попросили сделать перебором*/
//        while (listHash.size() < 2000000) {
//            int region = (int) ((Math.random() * 198) + 1); /*Чтобы быстрее генерил расширить второй множитель с 198 на 9998*/
//            int randomIndex = (int) (Math.random() * 9);
//            int randomIndexLetter1 = (int) (Math.random() * 9);
//            int randomIndexLetter2 = (int) (Math.random() * 9);
//            int randomIndexLetter3 = (int) (Math.random() * 9);
//
//            if (region >= 10 && region < 100) {
//                randomizedRegion = "0" + region;
//            } else if (region < 10) {
//                randomizedRegion = "00" + region;
//            } else {
//                randomizedRegion = String.valueOf(region);
//            }
//
//            randomizedNumber = letters[randomIndexLetter1] + numbers[randomIndex] + letters[randomIndexLetter2] + letters[randomIndexLetter3] + randomizedRegion;
//            listHash.add(randomizedNumber);
//
//            if (listHash.size() % 100000 == 0) {
//                System.out.println("Размер хешЛиста - " + listHash.size());
//            }
//            /*Отладочный кусок*/
////
////            if (listHash.size() == 8982) {
////                System.out.println("Имеется номер в хешЛисте? - " + listHash.contains(randomizedNumber));
////            }
////
////            if (listHash.size() % 100 == 0) {
////                System.out.println("Размер хешЛиста - " + listHash.size());
////            }
//        }

        for (int firstLetter = 0; firstLetter < letters.length; firstLetter++) {
            String fLetter = letters[firstLetter];

            for (int indexNumbers = 0; indexNumbers < numbers.length; indexNumbers++) {
                String number = numbers[indexNumbers];

                for (int secondLetter = 0; secondLetter < letters.length; secondLetter++) {
                    String sLetter = letters[secondLetter];

                    for (int thirdLetter = 0; thirdLetter < letters.length; thirdLetter++) {
                        String tLetter = letters[thirdLetter];

                        for (int regionNumber = 0; regionNumber <= 198; regionNumber++) {
                            String region = String.valueOf(regionNumber);
                            String coolNumber = fLetter + number + sLetter + tLetter + region;
                            listHash.add(coolNumber);
                        }
                    }
                }
            }
        }

        System.out.println("Размер хешЛиста - " + listHash.size());

        TreeSet<String> listTree = new TreeSet<>();
        listTree.addAll(listHash);

        System.out.println("Размер ТриСета - " + listTree.size());
        ArrayList<String> list = new ArrayList<>();
        list.addAll(listHash);
        System.out.println("Размер Еррея - " + list.size());

        /*Поиск*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номерной знак:");
        String inputNumber = scanner.nextLine();
        /*Перебор*/
        boolean listFound = false;
        long startArray = System.nanoTime();

        listFound = list.contains(inputNumber);

        long endArray = System.nanoTime() - startArray;
        System.out.println("Поиск перебором: " + "Номер найден? - " + listFound + " Поиск занял: " + endArray);

        /*Бинарный поиск*/
        Collections.sort(list);
        boolean binSearchFound = false;
        long startArrayBin = System.nanoTime();
        Integer indexBinSearch = Collections.binarySearch(list, inputNumber);
        long endArrayBin = System.nanoTime() - startArrayBin;
        if (!indexBinSearch.equals(-1)) {
            binSearchFound = true;
        }
        System.out.println("Бинарный поиск: " + "Номер найден? - " + binSearchFound + " Поиск занял: " + endArrayBin);

        /*HashSet*/
        boolean hashSetFound = false;
        long startHashSet = System.nanoTime();
        hashSetFound = listHash.contains(inputNumber);
        long endHashSet = System.nanoTime() - startHashSet;

        System.out.println("HashSet поиск: " + "Номер найден? - " + hashSetFound + " Поиск занял: " + endHashSet);

        /*TreeSet*/
        boolean treeSetFound = false;
        long startTreeSet = System.nanoTime();
        treeSetFound = listTree.contains(inputNumber);
        long endTreeSet = System.nanoTime() - startTreeSet;

        System.out.println("TreeSet поиск: " + "Номер найден? - " + treeSetFound + " Поиск занял: " + endTreeSet);
    }
}
