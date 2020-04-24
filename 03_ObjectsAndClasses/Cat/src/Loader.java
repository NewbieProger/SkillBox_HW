
public class Loader
{
    public static void main(String[] args)
    {
        System.out.println(); //Просто отступ

        Cat cat1 = new Cat();
        System.out.println("Cat1 weight: " + cat1.getWeight());
        cat1.feed(3.0);
        System.out.println("Cat1 weight after feed: " + cat1.getWeight());

        System.out.println(); //Просто отступ

        Cat cat2 = new Cat();
            System.out.println("Cat2 weight: " + cat2.getWeight());
            cat2.feed(3.0);
            System.out.println("Cat2 weight after feed: " + cat2.getWeight());

        System.out.println(); //Просто отступ

        Cat cat3 = new Cat();

        while (cat3.getWeight() <= cat3.getMaxWeight()) { //Перекармливаем кошку

                cat3.feed(1000.0);
                if (cat3.getWeight() >= cat3.getMaxWeight()) {
                    System.out.println("Cat3 is overfeed: " + cat3.getStatus());
                }
    }


        Cat cat4 = new Cat();

        System.out.println(); //Просто отступ
        System.out.println("Замяукиваем досмерти: ");

            while (cat4.getWeight() >= cat4.getMinWeight()) {
                cat4.meow();
                if (cat4.getWeight() <= cat4.getMinWeight()) {
                    System.out.println("Cat4 is overMeow'ed: " + cat4.getStatus());
                }
            }
        Cat cat5 = new Cat();
        System.out.println(); //Просто отступ

        cat5.getWeight();

        Cat cat6 = new Cat();
        System.out.println(); //Просто отступ

        cat6.getWeight();


        Cat cat7 = new Cat();
        System.out.println(); //Просто отступ

        cat7.getWeight();




    }
}