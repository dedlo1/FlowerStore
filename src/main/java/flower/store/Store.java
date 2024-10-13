package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<FlowerBucket> flowerBuckets = new ArrayList<>();

    public Store() {
    }

    public Store(List<FlowerBucket> flowerBuckets) {
        this.flowerBuckets = flowerBuckets;
    }

    public List<FlowerBucket> getFlowerBuckets() {
        return flowerBuckets;
    }

    public void addFlowerBucket(FlowerBucket flowerBucket) {
        flowerBuckets.add(flowerBucket);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerBucket flowerBucket : flowerBuckets) {
            price += flowerBucket.getPrice();
        }
        return price;
    }
}
