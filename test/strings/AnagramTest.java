package strings;

import static org.junit.Assert.*;

import org.junit.Test;

//import strings.Anagram;

public class AnagramTest {

	//Anagram Anagram = new Anagram();
    @Test
    public void testAreAnagrams() {
        // Test case 1: Strings are anagrams
        assertTrue(Anagram.checkAnagrams("SIVA", "AVIS"));

        // Test case 2: Strings are not anagrams
        assertFalse(Anagram.checkAnagrams("Hello", "World"));

        // Test case 3: Strings with different lengths
        assertFalse(Anagram.checkAnagrams("Java", "Jav"));

        // Test case 4: Anagrams with spaces
        assertTrue(Anagram.checkAnagrams("Listen", "Silent"));

        // Test case 5: Anagrams with different cases
        assertTrue(Anagram.checkAnagrams("Race", "Care"));

        // Test case 6: Empty strings are anagrams
        assertTrue(Anagram.checkAnagrams("", ""));

        // Test case 7: Failure test case (intentionally providing a non-anagram)
        assertTrue(Anagram.checkAnagrams("Test", "Failed"));

        // Add more test cases as needed
    }
}
