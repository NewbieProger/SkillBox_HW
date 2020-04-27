
public class Cat {
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double foodAmount;
    public static int count;
    public static final int COUNT_EYES = 2;
    public static final double MIN_WEIGHT = 2000.0;
    public static final double MAX_WEIGHT = 8000.0;
    private CatColour colour; //ЕНАМ переменная
    private int toysItHas;
    private String status;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        foodAmount = 0;
        count++;
        CatColour colour; //ЕНАМ переменная
        toysItHas = 0;
    }

    //Конструктор с вводом данных
    public Cat(double weight) {
        this();
        this.weight = weight;
        originWeight = weight;
    }

    //Конструктор на основе ЕНАМ данных
    public Cat(CatColour colour) {
        this();
        this.colour = colour;
    }

    //Копировальня
    public Cat copy(Cat original) {
        Cat copyCat = new Cat();
        setWeight(original.getWeight());
        setToysItHas(original.getToysItHas());
        setColour(getColour());
        feed(getFoodAmount());
        return copyCat;
    }

    public void meow() {
        if (isAlive()) {
            weight = weight - 1000;
            System.out.println("Meow");

            if (!isAlive()) {
                count--;
            }

        } else {
            System.out.println("Кошка респавнится...");
        }
    }

    public void feed(Double amount) {
        if (isAlive()) {
            weight = weight + amount;
            foodAmount = amount;

            if (!isAlive()) {
                count--;
            }
        } else {
            System.out.println("Кошка ушла внебытие. Нельзя поить");
        }
    }

    public void drink(Double amount) {
        if (isAlive()) {
            weight = weight + amount;
            if (!isAlive()) {
                count--;
            }
        } else {
            System.out.println("Кошка ушла внебытие. Нельзя поить");
        }
    }

    public Double getWeight() {
        return weight;
    }

    public double getMaxWeight() { //Возвращаем макс. значение массы, чтобы в цикле сравнить

        return maxWeight;
    }

    public double getMinWeight() { //Возвращаем макс. значение массы, чтобы в цикле сравнить

        return minWeight;
    }

    public double getFoodAmount() {
        return foodAmount;
    }

    public void pee() {

        if (isAlive()) {
            weight--;
            System.out.println("http://joxi.ru/l2ZpD56cEnXeXr");
        } else {
            System.out.println("Кошка ушла внебытие. Лоток больше убирать не надо");
        }

    }

    public boolean isAlive() {
        if (weight > minWeight && weight < maxWeight) {
            return true;
        } else {
            System.out.println("Кошка ушла внебытие");
            return false;
        }
    }

    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    public void setColour(CatColour colour) { //Геттер и Сеттер ЕНАМ данных
        this.colour = colour;
    }

    public CatColour getColour() {
        return colour;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getToysItHas() {
        return toysItHas;
    }

    public void setToysItHas(int toysItHas) {
        this.toysItHas = toysItHas;
    }


}