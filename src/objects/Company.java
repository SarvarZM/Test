package objects;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John",101,true,'M');

        Employee employee2 = new Employee("Mary",102,false,'F');

      //  System.out.println(employee2.gender);

        Employee employee3 = new Employee("Patel",103,true,'M');

        Employee employee4 = new Employee("Sarah",104,false,'F');

        Employee employee5 = new  Employee("Srinivasan",105,true,'M');

        Employee[]employees = {employee1,employee2,employee3,employee4,employee5};
/*
        for(int i = 0;i < employees.length;i++){
            if((employees[i].name.toLowerCase().contains("a") || employees[i].name.toLowerCase().contains("e")) && employees[i].id % 2 == 0){
                System.out.println(employees[i].name);
            }
        }
*/

        for(Employee e : employees){
            if(e.isRemote && e.gender == 'M' && e.name.length() > 2){
                System.out.println(e.name.substring(e.name.length()-3));
            }
        }



    }
}
