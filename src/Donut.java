public class Donut implements TimsConsum{
    String name = "Donut";
    double price = 4;
    int calories = 250;

    @Override
    public int getCalories() {
        return  this.calories;
    }

    @Override
    public String toString() {
        return "Name=" + name +
                "\nPrice=" + price +
                "\nCalories=" + calories;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
