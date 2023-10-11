import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testMainMethod() {
        // Redirect standard output to capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the main method to capture its output
        Main.main(null);

        // Restore standard output
        System.setOut(System.out);

        // Verify the output by checking the captured output
        String expectedOutput = "Hello, world!\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
}

