package functionalInterfacesTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import functionalInterfaces.ArrayListReversal;

public class ArrayListReversalTest {

    @Test
    public void testReverseArrayList() {
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);

        List<Integer> reversedList = ArrayListReversal.reverseArrayList(originalList);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(4);
        expectedList.add(3);
        expectedList.add(2);
        expectedList.add(1);

        assertEquals(expectedList, reversedList);
    }

    @Test
    public void testReverseArrayListEmptyList() {
        List<Integer> originalList = new ArrayList<>();

        List<Integer> reversedList = ArrayListReversal.reverseArrayList(originalList);

        List<Integer> expectedList = new ArrayList<>();

       assertEquals(expectedList, reversedList);
    }
}
