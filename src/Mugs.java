public class Mugs implements TimsMerch{

    String name = "Mug";
    double price = 5;
    String feature = "15oz Mug";
    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String toString() {
        return "Name=" + name +
                "\nPrice=" + price +
                " \nCalories=" + feature;
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
