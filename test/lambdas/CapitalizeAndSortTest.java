package lambdas;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class CapitalizeAndSortTest {

    @Test
    public void testCapitalizeAndSort() {
        String[] input1 = {"apple", "banana", "orange", "grapes", "mango"};
        String[] expected1 = {"Apple", "Banana", "Grapes", "Mango", "Orange"};
        
        String[] result1 = CapitalizeAndSort.capitalizeAndSort(input1);
        Arrays.stream(result1).forEach(System.out::println);
        assertArrayEquals(expected1, CapitalizeAndSort.capitalizeAndSort(input1));

        String[] input2 = {"java", "python", "csharp", "ruby", "javascript"};
        String[] expected2 = {"Csharp", "Java", "Javascript", "Python", "Ruby"};
        assertArrayEquals(expected2, CapitalizeAndSort.capitalizeAndSort(input2));
    }
}
