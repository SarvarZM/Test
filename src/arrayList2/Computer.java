package arrayList2;

public class Computer {

    private String brand;
    private int ram;

    static int numberOfButtons;

    static{
        numberOfButtons =100;
    }

    {
        System.out.println("In Instance Block");
    }


    public Computer(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

}
