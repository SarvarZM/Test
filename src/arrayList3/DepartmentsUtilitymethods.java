package arrayList3;

import java.util.ArrayList;
import java.util.List;

public class DepartmentsUtilitymethods {
    /**
     * Method returns list of department names located in the same location
     * Example:
     * .getDepartmentsFromLocation(departments,location) --> returns [Executive,...]
     */
    public static List<String> getDepartmentsFromLocation(List<Department> departments,int locationID){
        List <String> names = new ArrayList<>();

        for(Department d: departments){
            if(d.getLocationID() == locationID){
                names.add(d.getDepartmentName());
            }
        }
        return names;
    }
    /**
     * Takes departmentId and returns entire department Object
     * Example:
     * .getDepartmentId(department,departmentId) --> return [100,"Fainance",1700]
     */

    public static Department getDepartmentByID (List<Department> departments,int departmentID){

        for(Department d: departments){
            if(d.getDepartmentID() == departmentID){
                return d;
            }
        }
        return null;
    }
}
