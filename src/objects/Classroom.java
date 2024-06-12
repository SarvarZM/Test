package objects;

public class Classroom {
    public static void main(String[] args) {
        //Instance of a Class
        Student student = new Student();

        student.name = "Ahmed";
        student.id = 101;
        student.location = "Ohio";


        Student student2 = new Student();

        student2.name = "Galina";
        student2.id = 102;
        student2.location = "Florida";


        Student student3 = new Student();

        student3.name = "Ejegyz";
        student3.id = 103;
        student3.location = "Illinois";

        System.out.println(student.study());
        System.out.println(student3.location);

        Student [] students = new Student[3];
        students[0] = student;
        students[1] = student2;
        students[2] = student3;

        for(int i = 0; i<students.length;i++){
            System.out.println(students[i].location);
        }


    }
}
