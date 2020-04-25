
public class Loader {


    public static void main(String[] args) {
        System.out.println(); //Просто отступ
      //Кошка

        Cat cat1 = new Cat();
        System.out.println("Cat1 weight: " + cat1.getWeight());
        cat1.feed(3.0);
        System.out.println("Cat1 weight after feed: " + cat1.getWeight());

        System.out.println(); //Просто отступ

      //Кошка
        Cat cat2 = new Cat();
            System.out.println("Cat2 weight: " + cat2.getWeight());
            cat2.feed(3.0);
            System.out.println("Cat2 weight after feed: " + cat2.getWeight());


        Cat getkitten = getkitten();

        System.out.println("Вес котёнка: " + getkitten.getWeight());

    }

        //Кошка
        Cat cat4 = new Cat();

        System.out.println(); //Просто отступ
        System.out.println("Замяукиваем досмерти: ");

            while (cat4.getWeight() >= cat4.getMinWeight()) {
                cat4.meow();
                if (cat4.getWeight() <= cat4.getMinWeight()) {
                    System.out.println("Cat4 is overMeow'ed: " + cat4.getStatus());
                }
            }

        //Кошка //Тут жрём и сикаем. Что еще можно от жизни просить?
        Cat catC = new Cat();
        System.out.println(); //Просто отступ

        System.out.println(catC.getWeight());
        catC.feed(141.0);
        System.out.println(catC.getWeight());
        System.out.println(catC.getFoodAmount());


        //Кошка
        Cat catV = new Cat();
        System.out.println(); //Просто отступ

        System.out.println("Едим и сбрасываем вес:");

        System.out.println(catV.getWeight());
        catV.feed(150.0);
        System.out.println(catV.getWeight());
        catV.pee();
        catV.pee();
        catV.pee();
        System.out.println(catV.getWeight());
        System.out.println("Сожрано Вискаса: " + catV.getFoodAmount());

        catV.getWeight();

//        Кошка. Тут кормим мертвую кошку
        Cat cat7 = new Cat();
        System.out.println(); //Просто отступ

        cat7.getWeight();
        cat7.feed(10000.0);
        cat7.getStatus();
        cat7.feed(1.0);


        System.out.println(); //Просто отступ
        System.out.println(Cat.count); //Количество кошек. Учитывает взрыв и смерть

//            Тут поим мертвую кошку
        Cat cat8 = new Cat();
        System.out.println(); //Просто отступ

        cat8.drink(10000.0);
        System.out.println(cat8.getWeight());
        cat8.getStatus();
        cat8.drink(1.0);
        System.out.println(cat8.getWeight());


        //Писаемся до смерти
        Cat cat9 = new Cat();
        System.out.println(); //Просто отступ

        cat9.drink(10000.0);
        cat9.getStatus();
        cat9.pee();
