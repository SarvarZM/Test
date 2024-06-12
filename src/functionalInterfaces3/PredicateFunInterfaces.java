package functionalInterfaces3;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateFunInterfaces {
    public static void main(String[] args) {
        Predicate<String> containsLetterA = x-> x.toLowerCase().contains("a");

        System.out.println(containsLetterA.test("Java"));

        BiPredicate<String,String> isAnagram = (x,y)->{
            char [] xLetters = x.toCharArray();
            char [] yLetters =y.toCharArray();
            Arrays.sort(xLetters);
            Arrays.sort(yLetters);

            return Arrays.toString(xLetters).equals(Arrays.toString(yLetters));
        };
        System.out.println(isAnagram.test("abcd","dcba"));
    }
}
