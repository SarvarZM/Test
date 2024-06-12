package arrayList3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

    private static List<Employee> employees = new ArrayList<>();

    static{
        try{
        FileReader file = new FileReader("C:\\Users\\smura\\IdeaProjects\\MindTekJavaProject\\src\\arrayList3\\Employees.csv");

        BufferedReader br = new BufferedReader(file);
        String line = br.readLine();

        while(line !=null){
            String[] word = line.split(",");

            Job job =JobsUtilityMethods.getJobId(Data.getJobs(),word[4]);


            Employee employee = new Employee(word[0],word[1],Integer.parseInt(word[2]),DepartmentsUtilitymethods.getDepartmentByID(DepartmentData.getDepartments(),Integer.parseInt(word[3])),job);
            employees.add(employee);
            line=br.readLine();
        }
    }
        catch(IOException e){}
    }
    public static List<Employee> getEmployees(){
        return employees;
    }
}
