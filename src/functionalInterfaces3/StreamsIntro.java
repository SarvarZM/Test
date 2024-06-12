package functionalInterfaces3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsIntro {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(4,1,5,6,7,7,16);
        List<Integer> output= numbers.stream().filter(x-> x>0 && x<5).collect(Collectors.toList());


        System.out.println(output);

       long count = numbers.stream().filter(x-> x%2 ==1).count();

        System.out.println(count);

        List<Integer> uni = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println(uni);

        boolean anyMatch = numbers.stream().anyMatch(x->x>10 && x<20);

        System.out.println(anyMatch);

        String [] names = {"James","Patel","Bob","Charlie"};

       List<String> nameWithA= Arrays.stream(names).filter(x->x.contains("a")).collect(Collectors.toList());

        System.out.println(nameWithA);

    }


}
