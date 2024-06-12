package arrayList3;

import java.util.ArrayList;
import java.util.List;

public class TestEmployees {
    public static void main(String[] args) {
        /*
      //  System.out.println(EmployeeData.getEmployees().get(18).getDepartment().getLocationID());
        for(Employee e: EmployeeData.getEmployees()){

            if(e.getDepartment().getDepartmentName().equalsIgnoreCase("IT")){

                System.out.println(e.getFirstName());

            }
        }

         */
        int total =0;
        for(Employee e: EmployeeData.getEmployees()){
            if(e.getDepartment().getDepartmentName().equalsIgnoreCase("Finance")){
                total+=e.getJob().getSalary();

            }
        }
        System.out.println(total);
    }
}