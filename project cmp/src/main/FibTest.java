import main.fib;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibTest {

    @Test
    public void testFibonacci() {
        assertEquals(0, fib.Fib.fibonacci(0));
        assertEquals(1, fib.Fib.fibonacci(1));
        assertEquals(1, fib.Fib.fibonacci(2));
        assertEquals(2, fib.Fib.fibonacci(3));
        assertEquals(3, fib.Fib.fibonacci(4));
        assertEquals(5, fib.Fib.fibonacci(5));
        assertEquals(8, fib.Fib.fibonacci(6));
        assertEquals(13, fib.Fib.fibonacci(7));
        // Add more test cases as needed
    }
}


