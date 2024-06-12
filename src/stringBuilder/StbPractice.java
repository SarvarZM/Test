package stringBuilder;

public class StbPractice {
    public static void main(String[] args) {

        StringBuilder[] names ={new StringBuilder("John Doe"),new StringBuilder("Patel Harsh"), new StringBuilder("Kim Yan")};
        /*
        John Doe -> John - Doe
        replace letter a to o
        replace e to i

         */
        for(int i = 0;i< names.length;i++){
            names[i].insert(names[i].indexOf(" ")+1,"- ");

            while(names[i].indexOf("a")!= -1){
                names[i].replace(names[i].indexOf("a"),names[i].indexOf("a")+1,"o");
            }
            while(names[i].indexOf("e")!= -1){
                names[i].replace(names[i].indexOf("e"),names[i].indexOf("e")+1,"i");
            }
            System.out.println(names[i]);
            }
        }

    }
