package functionalInterfacesTest;

import org.junit.Test;

import functionalInterfaces.HashMapSorter;

import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;

public class HashMapSorterTest {

    @Test
    public void testSortHashMap() {
        HashMapSorter hashMapSorter = new HashMapSorter();

        // Create an unsorted HashMap
        Map<Integer, String> unsortedMap = new HashMap<>();
        unsortedMap.put(1, "Apple");
        unsortedMap.put(3, "Banana");
        unsortedMap.put(2, "Orange");
        unsortedMap.put(4, "Pineapple");

        // Expected sorted map based on values
        Map<Integer, String> expectedSortedMap = new HashMap<>();
        expectedSortedMap.put(1, "Apple");
        expectedSortedMap.put(3, "Banana");
        expectedSortedMap.put(2, "Orange");
        expectedSortedMap.put(4, "Pineapple");

        // Call the sortHashMap method
        Map<Integer, String> sortedMap = hashMapSorter.sortHashMap(unsortedMap);

        // Verify the result
        assertEquals(expectedSortedMap, sortedMap);
    }
}
