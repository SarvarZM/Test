package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<Integer>> listOfList = new ArrayList<>();
        List<Integer> list1 = List.of(4,5,1);
        List<Integer>list2 =List.of(3,2);
        listOfList.add(list1);
        listOfList.add(list2);

        List<Integer> number =listOfList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(number);



        String[] values ={"Today, I have","learned streams","and different operations"};

        List<String> words =Arrays.stream(values)
                .flatMap(element ->Arrays.stream(element.split(" ")))
                .collect(Collectors.toList());

        System.out.println(words);


    }
}
