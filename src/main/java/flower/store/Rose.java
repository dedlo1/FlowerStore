package flower.store;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents a Rose flower.
 */
@Getter
@Setter
public final class Rose {
    /**
     * Length of the sepal.
     */
    private double sepalLength;

    /**
     * Color of the flower.
     */
    private FlowerColor color;

    /**
     * Price of the flower.
     */
    private double price;

    /**
     * Type of the flower.
     */
    private FlowerType flowerType;

    /**
     * Constructor for Rose.
     *
     * @param sepalLength Length of the sepal.
     * @param color Color of the flower.
     * @param price Price of the flower.
     */
    public Rose(final double sepalLength, final FlowerColor color, final double price) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
        this.flowerType = FlowerType.ROSE;
    }

    /**
     * Gets the length of the sepal.
     *
     * @return Length of the sepal.
     */
    public double getSepalLength() {
        return sepalLength;
    }

    /**
     * Gets the color of the flower.
     *
     * @return Color of the flower.
     */
    public String getColor() {
        return color.toString();
    }

    /**
     * Gets the price of the flower.
     *
     * @return Price of the flower.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gets the type of the flower.
     *
     * @return Type of the flower.
     */
    public FlowerType getFlowerType() {
        return flowerType;
    }
}
