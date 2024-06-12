package functionalInterfaces3;

import java.util.function.Function;

public class BuiltInJavaFunctionalInterfaces {
    public static void main(String[] args) {
        Function<Integer,Boolean> validAge = x-> x>=18;

        System.out.println(validAge.apply(20));

        Function<String,String> getInitials = x-> {
            char first =x.charAt(0);
            char last = x.charAt(x.indexOf(" ")+1);
            return ""+first+last;
        };
        System.out.println(getInitials.apply("Sarvar Muratov"));

        Function<Car,Boolean> isBrandNew =x-> x.getYear()==2024;
    }
}
