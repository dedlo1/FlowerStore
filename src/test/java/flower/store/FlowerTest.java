package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Random;
import org.junit.jupiter.api.Assertions;

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
}
