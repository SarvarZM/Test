package mindTekProjectDay;

public class House {

    private int floors;
    private String address;
    private boolean forRent;


    public House(int floors, String address, boolean forRent) {
        this.floors = floors;
        this.address = address;
        this.forRent = forRent;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setForRent(boolean forRent) {
        this.forRent = forRent;
    }

    public int getFloors() {
        return floors;
    }

    public String getAddress() {
        return address;
    }

    public boolean isForRent() {
        return forRent;
    }
}
