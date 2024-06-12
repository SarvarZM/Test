package oop.polymorphoism.student;

import java.util.ArrayList;
import java.util.List;

public class TestStudents {
    public static void main(String[] args) {

        Student student = new OnlineStudent();
        Student student2 = new OfflineStudent();

        System.out.println(student);

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);

    }
    public static String getSchool(OnlineStudent student){
        return student.SCHOOL;
    }
}