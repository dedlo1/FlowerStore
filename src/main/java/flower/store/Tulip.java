package flower.store;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents a Tulip flower.
 */
@Getter
@Setter
public final class Tulip {
    /**
     * Length of the sepal.
     */
    private final double sepalLength;

    /**
     * Color of the flower.
     */
    private final FlowerColor color;

    /**
     * Price of the flower.
     */
    private final double price;

    /**
     * Type of the flower.
     */
    private final FlowerType flowerType;

    /**
     * Constructor for Tulip.
     *
     * @param sepalLength Length of the sepal.
     * @param color Color of the flower.
     * @param price Price of the flower.
     */
    public Tulip(final double sepalLength, final FlowerColor color, final double price) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
        this.flowerType = FlowerType.TULIP;
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
