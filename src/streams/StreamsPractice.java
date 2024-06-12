package streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {
    public static void main(String[] args) {
       List<String> colors = List.of("Red","Blue","White","Black","Green","Pink");

       Stream<String> stream= colors.stream();

      Stream<String>  sortedColors = stream
               .filter(x -> x.startsWith("B"))
        //Blue, Black
               .sorted();
        //Black,Blue

        List<String> outPut = sortedColors.filter(x -> x.contains("a"))
        //Black
                .collect(Collectors.toList());

        System.out.println(outPut);

        List<Integer> lengths = colors.stream()
                .map(x-> x.length())
                .collect(Collectors.toList());

        System.out.println(lengths);

       boolean result = colors.stream()
                .filter(x-> x.length() ==5)
                .anyMatch(x -> x.contains("B"));

        System.out.println(result);

        colors.stream()
                .filter(x -> x.length() == 4)
                .noneMatch(x ->x.toLowerCase().contains("b"));

        Integer max =colors.stream()
                .map(String::length)
                .max(Integer::compareTo).get();

        System.out.println("Max length "+ max);

        colors.stream()
                .forEach(System.out::println);











    }
}
