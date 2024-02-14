package lambdas;

import java.util.Arrays;
import java.util.Comparator;

public class CapitalizeAndSort {
    public static String[] capitalizeAndSort(String[] input) {
    	
        return Arrays.stream(input)
                .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1))
                .sorted(Comparator.naturalOrder())
                .toArray(String[]::new);
    }
}