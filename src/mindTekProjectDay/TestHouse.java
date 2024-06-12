package mindTekProjectDay;

public class TestHouse {
    public static void main(String[] args) {

        House house1=new House(1,"123 Walnut rd. Chicago IL",true);
        House house2=new House(2,"55 State st. New York NY",false);
        House house3=new House(3,"111 Dee rd. Los Angles CA",true);
        House house4=new House(1,"909 Arnold dr. Miami FL",false);

        House [] houses ={house1,house2,house3,house4};
/*
        for(House home:houses){
            if(home.isForRent()){
                System.out.println(home.getAddress());
            }
        }

 */
  /*      for(House home:houses){
            if(home.getFloors()<=2){
                System.out.println(home.getAddress());
            }
        }

   */
        for(int i=0;i<houses.length;i++){
            System.out.println("House "+(i+1));
            System.out.println("Floors: "+houses[i].getFloors());
            System.out.println("Address: "+houses[i].getAddress());
            System.out.println("For Rent: "+houses[i].isForRent());
        }
    }
}
