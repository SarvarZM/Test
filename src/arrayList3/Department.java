package arrayList3;

public class Department {
   private int departmentID;
   private String departmentName;
   private int locationID;

    public Department(int departmentID, String departmentName, int locationID) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.locationID = locationID;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentID=" + departmentID +
                ", departmentName='" + departmentName + '\'' +
                ", locationID=" + locationID +
                '}';
    }
}
