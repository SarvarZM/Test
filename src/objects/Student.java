package objects;
//Template BluePrint
public class Student {
    String name;

    int id;

    String location;

    public String study(){
        return name+ "is studying";

    }
    public String attendingClass(){
        return name+" is attending class from "+location;
    }
}
