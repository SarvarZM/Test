package stringBuilder;

public class ReverseSentence {
    public static void main(String[] args) {

        String str ="Java is easy";

        StringBuilder stb = new StringBuilder(str);

        StringBuilder output = new StringBuilder();

        stb.reverse();

        while(stb.indexOf(" ")!= -1){
            output.append(stb.substring(stb.lastIndexOf(" ")+1)).append(" ");
            stb.delete(stb.lastIndexOf(" "),stb.length());
        }
        System.out.println(output);

    }

}
