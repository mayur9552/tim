public class CoffeePowder implements TimsMerch{

    String name = "Coffee Powder";
    double price = 10;
    String feature  = "250 gm Coffee Poweder Pack";
    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String toString() {
        return "Name=" + name +
                "\nPrice=" + price +
                "\nCalories=" + feature;
    }

    @Override
    public String getFeature() {
        return null;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
