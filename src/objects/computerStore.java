package objects;

public class computerStore {
    public static void main(String[] args) {
        //Objects Can have as many as you want
        Computer computer1 = new Computer();

        computer1.brand = "Apple";
        computer1.operatingSystem = "MacOS";
        computer1.year = 2022;
        computer1.isLaptop = false;

        Computer computer2 = new Computer();

        computer2.brand = "Lenovo";
        computer2.operatingSystem = "Windows";
        computer2.year = 2017;
        computer2.isLaptop = true;

        Computer computer3 = new Computer();
        computer3.brand = "HP";
        computer3.operatingSystem = "Windows";
        computer3.year = 2020;
        computer3.isLaptop =true;

        Computer[] computers ={computer1,computer2,computer3};
/*
        for(int i  = 0; i< computers.length;i++){
            if(computers[i].year % 2 == 0){
                System.out.println(computers[i].year);
            }
        }
        */
        for(int i = 0;i < computers.length;i++){
            if(computers[i].isLaptop && computers[i].operatingSystem.equals("Windows")){
                System.out.println(computers[i].brand);
            }
        }


    }
}
