package functionalInterfacesTest;
import static org.junit.Assert.*;
import org.junit.Test;

import functionalInterfaces.CharacterCase;

public class CharacterCaseTest {

    @Test
    public void testConvertCase() {
        String input = "Hello World";
        String expected = "hELLO wORLD";
        assertEquals(expected, CharacterCase.convertCase(input));
    }

    @Test
    public void testConvertCaseEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, CharacterCase.convertCase(input));
    }
}
