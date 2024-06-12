package Method2;

public class CoinMethod {
    public int coinMethod (int input, int [] denominations){

        int coinCount = 0;

        for(int i = denominations.length-1; i >= 0; i--){
           while(input >= denominations[i]){
               input -= denominations[i];
               coinCount++;
           }


        }

        return coinCount;
    }

    public static void main(String[] args) {
        CoinMethod method = new CoinMethod();
        int [] denominations = {1,2,5,10,20,50,100,500,1000};
        System.out.println(method.coinMethod(-20,denominations));
    }
}
