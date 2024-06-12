package stringBuilder;

public class StbExample {
    public static void main(String[] args){
        //String is NOT Mutable --- Can't be changed -- Stores each new value separately
        //StringBuilder is Mutable --- Can be changed -- Saves on Heap memory
        long startTimeStb = System.currentTimeMillis();
        //Reference       = Object
        StringBuilder stb = new StringBuilder("Java");
        stb.append(" is easy");
        System.out.println(stb);

        long endTimeStb = System.currentTimeMillis();

        System.out.println("Time for StringBuilder "+(startTimeStb-endTimeStb));

        long startTimeStr = System.currentTimeMillis();

        String str = "Java";
        str = str +"is easy";
        System.out.println(str);

        long endTimeStr = System.currentTimeMillis();

        System.out.println("Time for Str "+(startTimeStr-endTimeStr));

    }
}
