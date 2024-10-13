package flower.store;

public class Rose {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public Rose(double sepalLength, FlowerColor color, double price) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
        this.flowerType = FlowerType.ROSE;
    }

    public double getSepalLength() {
        return sepalLength;
    }

    public String getColor() {
        return color.toString();
    }

    public double getPrice() {
        return price;
    }

    public FlowerType getFlowerType() {
        return flowerType;
    }
}
