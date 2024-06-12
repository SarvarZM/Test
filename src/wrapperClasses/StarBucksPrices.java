package wrapperClasses;

import java.util.Arrays;

public class StarBucksPrices {
    public static void main(String [] args){
        String[] prices={"Coffee $2.25","Cappuccino $4.45","Latte $4.10","Mocha $3.25"};

        //Update Prices of Each Drink by 10%

        /*
        1.Loop though each price
        2.Split String by dollar sign "Coffee"
        3.Take second element which is price and convert to int
        4. Add 10% price + price*.1
        5. Concatenate first element of array to new price
        6. Reassign old element with new String new price
         */
        for(int i=0;i<prices.length;i++){
            String[] elements=prices[i].split("\\$");

            double price =Double.parseDouble(elements[1]);
            price = price + price*.1;
            price = Math.round(price*100.0)/100.0;
            String newElement = elements[0]+"$"+price;
            prices[i]=newElement;
        }
        System.out.println(Arrays.toString(prices));
    }
}
