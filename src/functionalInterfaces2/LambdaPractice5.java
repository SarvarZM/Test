package functionalInterfaces2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class LambdaPractice5 {

    /*
       String str = "java";
       .getTotalWithCondition(str,condition); -> return
        */


    public static String getOutputWithCondition(String str,MethodCondition<Character> condition){
        StringBuilder output= new StringBuilder();
        for(int i=0; i<str.length();i++){
            if(condition.execute(str.charAt(i))){
                output.append(str.charAt(i));
            }
        }
        return output.toString();
    }

    public static List<Integer> getNumswithCondition(List<Integer> nums, MethodCondition<Integer> condition){
        List<Integer> outPut = new ArrayList<>();

        for(Integer num: nums){
            if(condition.execute(num)){
                outPut.add(num);
            }
        }
        return outPut;
    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(5,6,7,3,6,3,5,6));

        System.out.println(getOutputWithCondition("Java",x -> Character.isLowerCase(x)));

        System.out.println(getOutputWithCondition("JAva", x -> Character.isUpperCase(x)));

        System.out.println(getOutputWithCondition("Java", x ->"eiaou".contains(x+"")));

        System.out.println(getNumswithCondition(numbers,x -> x%2 ==0));

        Supplier<Integer> generateRandomNumber =() -> {
            Random random = new Random();
            return random.nextInt();
        };

        }

    }
