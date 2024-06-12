package arrayLisy;

import java.util.ArrayList;
import java.util.List;

public class PracticeList {

    public static void main(String[] args) {

        List<String> companies = new ArrayList<>(List.of("Google","Apple","Tesla","Meta","Mindtek","Amazon","Netflix"));

        System.out.println(companies.indexOf("Amazon")+1);


        for(int i = 0;i<companies.size();i++){
            String chars =""+ companies.get(i).charAt(0)+companies.get(i).charAt(companies.get(i).length()-1);
            companies.set(i,chars);
        }

        /*

        for(int i= 0;i<companies.size();i++){

            while(companies.get(i).length() == 5){

                companies.remove(i);
            }
        }

        System.out.println(companies);
/*
        for (int i =0; i < companies.size();i++){
          if(companies.get(i).startsWith("N")){
              companies.set(i,"MicroSoft");
          }

        }
        System.out.println(companies);

 */
    }


}
