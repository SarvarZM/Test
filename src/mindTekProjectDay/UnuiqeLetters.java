package mindTekProjectDay;

public class UnuiqeLetters {
    public boolean oneLetter (String name){

        for(int i =0;i<name.length();i++){
            for(int j =i+1;j<name.length();j++){
                if(name.charAt(i) == name.charAt(j)){
                    return false;
                }

            }

        }
        return true;

    }

    public static void main(String[] args) {
        UnuiqeLetters unuiqeLetters = new UnuiqeLetters();
        System.out.println(unuiqeLetters.oneLetter("HelLo"));
    }

}
