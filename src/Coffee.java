public class Coffee implements TimsConsum{
    String name = "Coffee";
    double price = 1.5;
    int calories = 180;
    @Override
    public int getCalories() {
        return this.calories;
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
