
public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double foodAmount;
    public static int count;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        foodAmount = 0;
        count = count + 1;
    }

    private static int getCount() {
        return count;
    }

    public void meow()
    {
        weight = weight - 1000; // Побольше поставил, а то мусора в логах много
        System.out.println("Meow");
    }

    public double feed(Double amount)
    {
        weight = weight + amount;
        foodAmount = amount;
        return foodAmount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
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
        weight = weight - 1;
        System.out.println("http://joxi.ru/l2ZpD56cEnXeXr");
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
}