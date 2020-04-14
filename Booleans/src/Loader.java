
public class Loader {
//    Рецепты
//    powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
//    milk - 300 ml, powder - 5 g, eggs - 5
//    apples - 3, milk - 100 ml, powder - 300 g, eggs - 4

  public static void main(String[] args) {
    int powderAmount = 300; // g
    int milkAmount = 300; // ml
    int sugarAmount = 10; // g
    int eggsCount = 5; // items
    int oilAmount = 30; // ml
    int appleCount = 1; // items

    boolean canCookAnything = (powderAmount >= 400) && (milkAmount >= 300) && (eggsCount >= 5) && (oilAmount >= 30) && (appleCount >= 3);
    boolean basisPancakes = (powderAmount >= 400) && (milkAmount >= 1);
    boolean basisApplePie = (powderAmount >= 300) && (milkAmount >= 100) && (eggsCount >= 4);
    boolean basisOmelette = (powderAmount >= 5) && (milkAmount >= 300) && (eggsCount >= 5);

      if (canCookAnything) {
        System.out.println("Готовь, что угодно: печенья, яблочный пирог, омлет. Что-нибудь одно");

        } else if (basisPancakes && (sugarAmount >= 10) && (oilAmount >= 30)) {
          System.out.println("Pancakes");

            } else if (basisApplePie && (appleCount >= 3)) {
              System.out.println("Apple pie");

                } else if (basisOmelette) {
                  System.out.println("Omelette");

                  } else {
                    System.out.println("Сиди голодным");
      }
  }

}
//
//