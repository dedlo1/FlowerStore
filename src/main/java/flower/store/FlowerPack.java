package flower.store;

/**
 * Represents a pack of flowers.
 */
public final class FlowerPack {
    /**
     * The flower in the pack.
     */
    private final Flower flower;

    /**
     * The quantity of flowers in the pack.
     */
    private final int quantity;

    /**
     * Constructor for FlowerPack.
     *
     * @param flowerCp The flower in the pack.
     * @param qty The quantity of flowers in the pack.
     */
    public FlowerPack(final Flower flowerCp, final int qty) {
        this.flower = flowerCp;
        this.quantity = qty;
    }

    /**
     * Gets the flower in the pack.
     *
     * @return The flower in the pack.
     */
    public Flower getFlower() {
        return flower;
    }

    /**
     * Gets the quantity of flowers in the pack.
     *
     * @return The quantity of flowers in the pack.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Gets the total price of the flower pack.
     *
     * @return The total price of the flower pack.
     */
    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
