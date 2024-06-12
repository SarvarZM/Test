package stringBuilder;

public class StbMethods {
    public static void main(String[] args) {

        StringBuilder stb = new StringBuilder("Computer");

        //.insert (starting index,value)
        stb.insert(0,"Apple ");
        System.out.println(stb);

        // .reverse() -- Reverse
        stb.reverse();
        System.out.println(stb);

        // Delete one letter
        stb.deleteCharAt(3);
        System.out.println(stb);

        //Delete from one index to another index
        stb.delete(0,5);
        System.out.println(stb);

        // .replace()
        stb.replace(0,1,"c");
        System.out.println(stb);





    }
}
