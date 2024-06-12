package stringBuilder;

public class RemoveDuplicates {

    public String removeDuplicateChars(String word) {

        StringBuilder stb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (word.substring(i,i+1).equals(" ") || stb.indexOf(word.substring(i, i + 1)) == -1) {
                stb.append(word.charAt(i));
            }
        }

        return stb.toString();
    }

    public static void main(String[] args) {

        RemoveDuplicates methods = new RemoveDuplicates();

        System.out.println(methods.removeDuplicateChars("Helllllo"));



    }

}
