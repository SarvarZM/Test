package arrayList2;

import java.util.ArrayList;
import java.util.List;

public class UtilityMethods {
    /**
     * This method takes program id as parameter and return students who attend that program.
     * Example:
     * .getStudents(101)-> return list of students
     */

    public static List<Student> getStudents(List<Student> students, int programId) {
        List<Student> studentList = new ArrayList<>();

        for (Student s : students) {
            if (s.getProgram().getId() == programId) {
                studentList.add(s);
            }
        }
        return studentList;

    }

    /**
     * Method returns a list of classes for a provided program
     * Example
     * .getClasses("Java Development"); return list of classes
     */
    public static List<String> getClasses(List<Program> programs, String className) {

        for (Program p : programs) {
            if (p.getName().equalsIgnoreCase(className)) {
                return p.getClasses();
            }
        }
        return null;
    }
    /**
     * Method takes list of students and location of students as parameters
     * and returns list of ids of students who study from that location
     * Example:
     * .getStudentIds(students,"Chicago IL")return [1]
     */
    public static List<Integer> getStudentIds(List<Student> students, String location) {

        List<Integer> ids = new ArrayList<>();
        for(Student s: students){
            if (s.getLocation().equalsIgnoreCase(location)) {
                ids.add(s.getId());
            }
        }
        return ids;
    }
}