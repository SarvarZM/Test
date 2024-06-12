package arrayList2;

import java.util.ArrayList;
import java.util.List;

public class Mindtek {
    public static void main(String[] args) {
        List<String> sdetClasses = new ArrayList<>(List.of("Java","Selenium","TestNG","Cucumber","SQL","Rest API"));
        Program program1 = new Program("SDET",100,sdetClasses);

        List<String> javaClasses = new ArrayList<>(List.of("Java","Java Streams","Java Generics","SpringBoot","Git","Unit Test","Cloud"));
        Program program2 = new Program("Java Development",101,javaClasses);

        List<String> salesForceClasses = new ArrayList<>(List.of("Administrator","Apex","LWC","Aura","SOQL","Integration",""));
        Program program3 = new Program("Java Development",102,salesForceClasses);

        Student student1 = new Student("John Doe",1,"Chicago IL",program2);
        Student student2 = new Student("Patel Harsh",2,"Austin TX",program1);
        Student student3 = new Student("Kim Yan",3,"Los Angles CA",program3);
        Student student4 = new Student("Sunuthi Lakka",4,"New York NY",program2);
        Student student5 = new Student("Brad Pitt",5,"Miami FL",program1);

       // System.out.println(student1);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);


        // System.out.println(students);

        for(Student s: students){

            System.out.println(s.getName()+" is attending "+s.getProgram().getName()+" program.");
        }
        System.out.println(UtilityMethods.getStudents(students,101));
        System.out.println(UtilityMethods.getStudents(students,102));

        System.out.println("=================================");
        List<Program> programList = new ArrayList<>();
        programList.add(program1);
        programList.add(program2);
        programList.add(program3);
        System.out.println(UtilityMethods.getClasses(programList,"SDET"));
    }


}
