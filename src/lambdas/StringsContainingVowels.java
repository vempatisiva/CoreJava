package lambdas;

import java.util.Arrays;

public class StringsContainingVowels {
    public static void printStringsWithVowels(String[] input) {
        Arrays.stream(input)
                .filter(str -> str.toLowerCase().matches(".*[aeiou].*"))
                .forEach(str -> {
                    long vowelCount = str.chars()
                            .mapToObj(ch -> (char) ch)
                            .filter(ch -> "aeiouAEIOU".indexOf(ch) != -1)
                            .count();
                    System.out.println("String: " + str + ", Vowel Count: " + vowelCount);
                });
    }
}