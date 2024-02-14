package functionalInterfaces;
import org.junit.Test;
import static org.junit.Assert.*;
public class PalindromeTest {

        @Test
        public void testIsPalindromeTrue() {
            assertTrue(functionalInterfaces.Palindrome.isPalindrome(1221));
        }

        @Test
        public void testIsPalindromeFalse() {
            assertFalse(functionalInterfaces.Palindrome.isPalindrome(12345));
        }
    }

