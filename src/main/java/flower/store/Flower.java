package flower.store;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents a generic flower.
 */
@Setter
public final class Flower {
    /**
     * Length of the sepal.
     */
    @Getter
    private double sepalLength;

    /**
     * Color of the flower.
     */
    private FlowerColor color;

    /**
     * Price of the flower.
     */
    @Getter
    private double price;

    /**
     * Type of the flower.
     */
    @Getter
    private FlowerType flowerType;

    /**
     * Gets the color of the flower.
     *
     * @return Color of the flower.
     */
    public String getColor() {
        return color.toString();
    }
}
