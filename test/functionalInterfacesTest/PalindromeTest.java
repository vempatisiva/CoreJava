package functionalInterfacesTest;

import org.junit.Test;

import functionalInterfaces.Palindrome;

import static org.junit.Assert.*;
public class PalindromeTest {

        @Test
        public void testIsPalindromeTrue() {
            assertTrue(Palindrome.isPalindrome(1221));
        }

        @Test
        public void testIsPalindromeFalse() {
            assertFalse(Palindrome.isPalindrome(12345));
        }
    }




