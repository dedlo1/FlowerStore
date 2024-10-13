package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * Tests for the Flower class.
 */
public final class FlowerTest {
    /**
     * Random generator for test data.
     */
    private static final Random RANDOM_GENERATOR = new Random();

    /**
     * Maximum price for test data.
     */
    private static final int MAX_PRICE = 100;

    /**
     * Flower instance for testing.
     */
    private Flower flower;

    /**
     * Initializes the test environment.
     */
    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    /**
     * Tests the price setting and getting functionality.
     */
    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    /**
     * Tests the color setting and getting functionality.
     */
    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("#FF0000", flower.getColor());
    }

    /**
     * Tests the flower type setting and getting functionality.
     */
    @Test
    public void testFlowerType() {
        FlowerType flowerType = FlowerType.ROSE;
        flower.setFlowerType(flowerType);
        Assertions.assertEquals(flowerType, flower.getFlowerType());
    }

    /**
     * Tests the sepal length setting and getting functionality.
     */
    @Test
    public void testSepalLength() {
        double sepalLength = RANDOM_GENERATOR.nextDouble();
        flower.setSepalLength(sepalLength);
        Assertions.assertEquals(sepalLength, flower.getSepalLength());
    }

    /**
     * Tests the flower type Chamomile.
     */
    @Test
    public void testChamomile() {
        Chamomile chamomile = new Chamomile(1.0, FlowerColor.RED, 1.0);
        Assertions.assertEquals(
            FlowerType.CHAMOMILE, chamomile.getFlowerType()
            );
    }

    /**
     * Tests the flower type Rose.
     */
    @Test
    public void testRose() {
        Rose rose = new Rose(1.0, FlowerColor.RED, 1.0);
        Assertions.assertEquals(FlowerType.ROSE, rose.getFlowerType());
    }

    /**
     * Tests the flower type Tulip.
     */
    @Test
    public void testTulip() {
        Tulip tulip = new Tulip(1.0, FlowerColor.BLUE, 1.0);
        Assertions.assertEquals(FlowerType.TULIP, tulip.getFlowerType());
    }

    /**
     * Tests the FlowerBucket class.
     */
    @Test
    public void testFlowerBucket() {
        FlowerBucket bucket = new FlowerBucket();
        Assertions.assertNotNull(bucket.getFlowerPacks());
    }
}
