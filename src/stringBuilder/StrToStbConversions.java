package stringBuilder;

public class StrToStbConversions {
    public static void main(String[] args) {

        String str = "John";
        // String --> StringBuilder
        StringBuilder stb = new StringBuilder(str);

        // StringBuilder --> String

        String str2 = stb.toString();


    }
}
