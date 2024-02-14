package lambdas;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;



public class StringsContainingVowelsTest {

    @Test
    public void testPrintStringsWithVowels() {
        // Redirect System.out for testing
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Test case
        String[] testArray = {"apple", "banana", "orange", "grapes", "mango"};
        StringsContainingVowels.printStringsWithVowels(testArray);

        // Reset System.out''
        System.setOut(System.out);

        // Verify output
        String expectedOutput = "String: apple, Vowel Count: 2\n" +
                                "String: banana, Vowel Count: 3\n" +
                                "String: orange, Vowel Count: 3\n" +
                                "String: grapes, Vowel Count: 2\n" +
                                "String: mango, Vowel Count: 2\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
