package flower.store;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a bucket of flower packs.
 */
public final class FlowerBucket {
    /**
     * List of flower packs in the bucket.
     */
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    /**
     * Default constructor for FlowerBucket.
     */
    public FlowerBucket() {
    }

    /**
     * Constructor for FlowerBucket with flower packs.
     *
     * @param flowerPacks List of flower packs.
     */
    public FlowerBucket(final List<FlowerPack> flowerPacks) {
        this.flowerPacks = flowerPacks;
    }

    /**
     * Gets the list of flower packs.
     *
     * @return List of flower packs.
     */
    public List<FlowerPack> getFlowerPacks() {
        return flowerPacks;
    }

    /**
     * Adds a flower pack to the bucket.
     *
     * @param pack Flower pack to add.
     */
    public void addFlowerPack(final FlowerPack pack) {
        flowerPacks.add(pack);
    }

    /**
     * Gets the total price of all flower packs in the bucket.
     *
     * @return Total price of flower packs.
     */
    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }
}
