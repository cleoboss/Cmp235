import org.junit.jupiter.api.Test;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestTest {

    @Test
    public void testMultiply() {
        int result = Test.multiply(3, 4);
        assertEquals(12, result);
    }

    @Test
    public void testMultiplyWithZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Test.multiply(0, 4);
        });
    }

    @Test
    public void testReverseString() {
        String reversed = Test.reverseString("hello");
        assertEquals("olleh", reversed);
    }

    @Test
    public void testReverseStringWithNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            Test.reverseString(null);
        });
    }
}
