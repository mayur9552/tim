public class HockeyCard implements TimsMerch{

    String name = "Hockey Card";

    double price = 8;
    String feature = "Love Sport? Get Hockey Card";
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
