package functionalInterfaces2;

public class TestChecker {
    public static void main(String[] args) {

        Checker<Integer,Integer> sum = (x)->{
            Integer total = 0;

            for(Integer num: x){
                total+=num;
            }
            return total;
        };
        Integer [] nums ={5,2,6};
        System.out.println(sum.execute(nums));


        Checker<Integer,Boolean> trueFalse = x-> sum.execute(x)>20;

        System.out.println(trueFalse.execute(nums));


        /*
        Implement Lambda expression for checker that takes array of strings and return all elements concatinated
         */

        Checker<String,String> wordAdded = (x)-> {
            StringBuilder holder = new StringBuilder();
            for(String word:x){
                holder.append(word).append(" ");
            }
            return holder.toString().trim();
        };
        String [] words ={"Java","Mindtek","Dev"};
        System.out.println(wordAdded.execute(words));

        /*
        String[] prices ={"$2.4","$5.2","$3"}
          */

        Checker<String,Double> priceCalc = (x)-> {
            Double total =0.0;

            for(String price:x){
                Double p=Double.valueOf(price.substring(1));
                total+=p;
            }
            return total;
        };
        String[] prices ={"$2.4","$5.2","$3"};
        System.out.println(priceCalc.execute(prices));

    }
}
