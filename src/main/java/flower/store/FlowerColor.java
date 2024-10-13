package flower.store;

/**
 * Enum representing flower colors.
 */
public enum FlowerColor {
    /**
     * Red color.
     */
    RED("#FF0000"),
    /**
     * Blue color.
     */
    BLUE("#0000FF");

    /**
     * String representation of the color.
     */
    private final String stringRepresentation;

    /**
     * Constructor for FlowerColor.
     *
     * @param colorRepresentation String representation of the color.
     */
    FlowerColor(final String colorRepresentation) {
        this.stringRepresentation = colorRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
