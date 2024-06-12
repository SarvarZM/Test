package arrayLisy;

import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {

        List list = new ArrayList<>();

        list.add("John");

        list.add(7);

        list.remove(0);

        System.out.println(list);

        System.out.println(list.isEmpty());
    }
}
