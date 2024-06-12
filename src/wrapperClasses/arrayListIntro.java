package wrapperClasses;
import java.util.ArrayList;
import java.util.List;

public class arrayListIntro {
    public static void main(String[] args) {

        List <String> list = new ArrayList<>();//Resizable

    //    String[] array = new String[5];//Fixed Size
        list.add("Java");
        list.add("Python");
        list.add("JavaScript");
        list.add("C#");
        list.add("C++");

        //list.size instead of .length();

        list.set(2,"TypeScript");

        list.add(1,"Javascript");

        for(String str: list){
            System.out.println(str);
        }
        System.out.println("===========");

        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }






    }
}
