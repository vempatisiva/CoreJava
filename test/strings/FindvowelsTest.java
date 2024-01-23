package strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindvowelsTest {

    @Test
    public void testCountVowels() {
        // Test case 1: String with all vowels
        assertEquals(5, Findvowels.countVowels("aeiou"));

        // Test case 2: String with mixed characters
        assertEquals(2, Findvowels.countVowels("Hello"));

        // Test case 3: String with no vowels
        assertEquals(0, Findvowels.countVowels("BCDFG"));

        // Test case 4: String with uppercase vowels
        assertEquals(3, Findvowels.countVowels("Programming"));

        // Test case 5: Empty string
        assertEquals(0, Findvowels.countVowels(""));

        // Test case 6: String with spaces
        assertEquals(4, Findvowels.countVowels("This is a test"));

        // Add more test cases as needed
    }
}
