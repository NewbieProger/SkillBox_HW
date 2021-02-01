public class CatLoader {
    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.println(); //Просто отступ
        //Кошка

        Cat cat1 = new Cat();
        System.out.println("Cat1 weight: " + cat1.getWeight());
        cat1.feed(3.0);
        System.out.println("Cat1 weight after feed: " + cat1.getWeight());
        cat1.setColour(CatColour.BLACK);
        System.out.println(cat1.getColour());

        System.out.println(); //Просто отступ

        //Кошка
        Cat cat2 = new Cat();
        System.out.println("Cat2 weight: " + cat2.getWeight());
        cat2.feed(3.0);
        System.out.println("Cat2 weight after feed: " + cat2.getWeight());

        System.out.println(); //Просто отступ


        //Кошка //Перекармливаем кошку
        Cat cat3 = new Cat();
        System.out.println("Перекармливаем до взрыва: ");
        while (cat3.getWeight() <= cat3.getMaxWeight()) {

            cat3.feed(1000.0);
            if (cat3.getWeight() >= cat3.getMaxWeight()) {
                System.out.println("Cat3 is overfeed: " + cat3.getStatus());
            }
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

        catC.getWeight();

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
        catV.setToysItHas(54);

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
        cat8.setToysItHas(4);
        System.out.println(cat8.getToysItHas());

        //Писаемся до смерти
        Cat cat9 = new Cat();
        System.out.println(); //Просто отступ

        cat9.drink(10000.0);
        cat9.getStatus();
        cat9.pee();

        System.out.println(cat9.getStatus());

        //Показываем количество живых кошек
        System.out.println("Количество выживших: " + Cat.count);

        //Новый конструктор
        Cat catWeight = new Cat(4500.0);
        System.out.println(catWeight.getWeight());

        //Котёнок, где создаём объект через метод
        Cat getKitten = getKitten();

        System.out.println("Вес котёнка: " + getKitten.getWeight());

        //ЕНАМовский котёнок
        Cat ps1 = new Cat(CatColour.RED);
        System.out.println(ps1.getColour());


        Cat getKittenWithColour = getKittenWithColour();
        System.out.println("Котенок с краской из ENUM: " + getKittenWithColour.getColour());
        System.out.println(); //Просто отступ


        //Клонируем кота


//
//        Cat cat500 = new Cat();
//        System.out.println("Cat 500 ves:" + cat500.getWeight());
//        cat500.copy(cat8);
//        System.out.println("Cat 500 ves:" + cat500.getWeight());

        Cat copyCat = catV.copy(); //Вызываем метод копирования и передаем старую кошку, в котором копирует вес и игрушки
        System.out.println("catV toys and weight before copy: " + catV.getToysItHas() + " " + catV.getWeight());
        System.out.println("copyCat toys and weight before copy: " + copyCat.getToysItHas() + " " + copyCat.getWeight());
        copyCat.feed(530.0);
        copyCat.setToysItHas(12);
        System.out.println("catV toys and weight after copy: " + catV.getToysItHas() + " " + catV.getWeight());
        System.out.println("copyCat toys and weight after copy: " + copyCat.getToysItHas() + " " + copyCat.getWeight());


        copyCat.feed(324.0); //Кормим скопированную кошку

        System.out.println("catV weight after feed: " + catV.getWeight() + "\n" + " copyCat weight after feed: " + copyCat.getWeight()); //Проверяем, что мы покорпили скопированную кошку и вес изменился только у неё, а не у оригинала
    }

    private static Cat getKitten() { //А тут вопросы: В методt можно обращаться к другим классам (Cat)? где-то чего то я не понимаию. Можно Конкретики?
        Cat kitty = new Cat(1100.0);
        return kitty;
    }

    private static Cat getKittenWithColour() { //Метод на конструктор создания кота с цветом
        Cat kotenok = new Cat(CatColour.ORANGE);
        return kotenok;
    }


}
