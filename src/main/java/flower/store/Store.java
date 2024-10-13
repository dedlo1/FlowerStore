package flower.store;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a store that contains flower buckets.
 */
public final class Store {
    /**
     * List of flower buckets in the store.
     */
    private final List<FlowerBucket> flowerBuckets = new ArrayList<>();

    /**
     * Default constructor for Store.
     */
    public Store() {
    }

    /**
     * Constructor for Store with flower buckets.
     *
     * @param flowerBuckets List of flower buckets.
     */
    public Store(final List<FlowerBucket> flowerBuckets) {
        this.flowerBuckets.addAll(flowerBuckets);
    }

    /**
     * Gets the list of flower buckets.
     *
     * @return List of flower buckets.
     */
    public List<FlowerBucket> getFlowerBuckets() {
        return flowerBuckets;
    }

    /**
     * Adds a flower bucket to the store.
     *
     * @param bucket Flower bucket to add.
     */
    public void addFlowerBucket(final FlowerBucket bucket) {
        flowerBuckets.add(bucket);
    }

    /**
     * Gets the total price of all flower buckets in the store.
     *
     * @return Total price of flower buckets.
     */
    public double getPrice() {
        double price = 0;
        for (FlowerBucket flowerBucket : flowerBuckets) {
            price += flowerBucket.getPrice();
        }
        return price;
    }
}
