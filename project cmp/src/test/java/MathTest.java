

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {

    @Test
    public void testAddition() {
        int result = Math.add(3, 4);
        assertEquals(7, result);
    }

    @Test
    public void testSubtraction() {
        int result = Math.subtract(7, 3);
        assertEquals(4, result);
    }

    @Test
    public void testMultiplication() {
        int result = Math.multiply(2, 5);
        assertEquals(10, result);
    }

    @Test
    public void testDivision() {
        double result = Math.divide(10, 2);
        assertEquals(5.0, result, 0.001); // Using delta for double comparison
    }
}

