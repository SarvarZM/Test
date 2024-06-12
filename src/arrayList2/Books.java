package arrayList2;

import java.util.ArrayList;
import java.util.List;

public class Books {
    public static void main(String[] args) {

        List<String> books1 = new ArrayList<>();

        books1.add("10x Rules");
        books1.add("War & Peace");
        books1.add("OCA Book");

        List<String> books2 = new ArrayList<>();
        books2.add("10x Rules");
        books2.add("War & Peace");
        books2.add("OCA Book");

        if(books1.equals(books2)){
            System.out.println("Same Books");
        }else{
            System.out.println("Different Books");
        }
    }
}
