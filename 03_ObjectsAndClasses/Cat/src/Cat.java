
public class Cat
{
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

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        foodAmount = 0;
        count = count + 1;
        CatColour colour; //ЕНАМ переменная
    }

    public Cat (double weight) {
        this();
        this.weight = weight;
    }

    public Cat (CatColour colour) { //Конструктор на основе ЕНАМ данных
        this();
        this.colour = colour;
    }

    public void meow()
    {
        weight = weight - 1000; // Побольше поставил, а то мусора в логах много
        System.out.println("Meow");
    }

    public double feed(Double amount)
    {
        if (weight > minWeight && weight < maxWeight) {
            weight = weight + amount;
            foodAmount = amount;
        } else {
            System.out.println("Кошка ушла внебытие. Нельзя кормить");
        }
        return foodAmount;
    }

    public void drink(Double amount)
    {
        if (weight > minWeight && weight < maxWeight) {
            weight = weight + amount;
        } else {
            System.out.println("Кошка ушла внебытие. Нельзя поить");
        }
    }

    public Double getWeight()
    {
        return weight;
    }

    public double getMaxWeight () { //Возвращаем макс. значение массы, чтобы в цикле сравнить

        return maxWeight;
    }

    public double getMinWeight () { //Возвращаем макс. значение массы, чтобы в цикле сравнить

        return minWeight;
    }

    public double getFoodAmount() {
        return foodAmount;
    }

    public void pee() {

        if (weight > minWeight && weight < maxWeight) {
            weight = weight - 1;
            System.out.println("http://joxi.ru/l2ZpD56cEnXeXr");
        } else {
            System.out.println("Кошка ушла внебытие. Лоток больше убирать не надо");
        }

    }

    public String getStatus()
    {
        if(weight < minWeight) {
            count = count - 1;
            return "Dead";
        }
        else if (weight > maxWeight) {
            count = count - 1;
            return "Exploded";
        }
        else if (weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public void setColour(CatColour colour) { //Геттер и Сеттер ЕНАМ данных
        this.colour = colour;
    }

    public CatColour getColour() {
        return colour;
    }

}