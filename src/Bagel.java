public class Bagel implements TimsConsum{

    String name = "Bagel";
    double price = 3;
    int calories = 300;
    @Override
    public int getCalories(){
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
