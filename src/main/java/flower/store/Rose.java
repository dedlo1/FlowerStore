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
     * @param sepalLen Length of the sepal.
     * @param flowerColor Color of the flower.
     * @param flowerPrice Price of the flower.
     */
    public Rose(
        final double sepalLen,
        final FlowerColor flowerColor,
        final double flowerPrice
        ) {
        this.sepalLength = sepalLen;
        this.color = flowerColor;
        this.price = flowerPrice;
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
