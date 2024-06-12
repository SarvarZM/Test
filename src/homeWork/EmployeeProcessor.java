package homeWork;

import java.util.ArrayList;
import java.util.List;

public class EmployeeProcessor {
    public static List<String> processEmployees(List<Employee> employees, Condition<Employee> condition, AttributeFunction<Employee, String> function) {
        List<String> newList = new ArrayList<>();
        double avg =0;
        for (Employee e : employees) {
            if (condition.condition((e))) {
                function.execute(e);
                avg+=e.getSalary();
                newList.add(String.valueOf(e));

            }
        }
        newList.add("AVG Salary: "+(avg/newList.size()));
        return newList;
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 60000.0, "HR"));
        employees.add(new Employee("Bob", 45, 80000.0, "IT"));
        employees.add(new Employee("Charlie", 25, 50000.0, "IT"));
        employees.add(new Employee("David", 35, 70000.0, "Finance"));
        employees.add(new Employee("Eve", 40, 90000.0, "HR"));



        Condition<Employee> itDepartmentCondition = e -> "IT".equals(e.getDepartment());

        AttributeFunction<Employee, String> nameToUpperCase = e -> e.getName().toUpperCase();

        List<String> result = processEmployees(employees, itDepartmentCondition, nameToUpperCase);

        System.out.println(result);





    }
}
