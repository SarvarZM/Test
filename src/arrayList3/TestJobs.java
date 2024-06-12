package arrayList3;

import java.util.ArrayList;
import java.util.List;

public class TestJobs {

    public static void main(String[] args) {

       // System.out.println(Data.getJobs());
        //System.out.println(JobsUtilityMethods.getSalaryOf("Sales Representativ",Data.getJobs()));

        List<String> title = new ArrayList<>(List.of("Finance Manager","Stock Clerk"));
        System.out.println(JobsUtilityMethods.increaseSalary(title,30,Data.getJobs()));
    }

}
