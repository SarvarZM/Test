package homeWork;

public class StringSum {

    int getSumOfString (String word){
        int temp=0;
        int sum=0;

      for(int i=0;i< word.length();i++){
          if(Character.isDigit(word.charAt(i))){
              temp =temp * 10 + word.charAt(i) - '0';
          }else{
              sum+=temp;
              temp=0;
          }
      }
      return sum+=temp;

    }
}
