package flower.store;

public class Chamomile {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public Chamomile(double sepalLength, FlowerColor color, double price) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
        this.flowerType = FlowerType.CHAMOMILE;
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
