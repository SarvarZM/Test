package arrayLisy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SpecificList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(16);
        list.add(24);
        list.add(33);
        Integer sum= 0;
        for(Integer num: list){
            if(num%2 != 0){
                sum +=num;
            }
        }
        System.out.println(sum);
        list.add(10);
        Collections.sort(list);
        System.out.println(list);
    }
}
