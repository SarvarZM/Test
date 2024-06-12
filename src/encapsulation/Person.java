package encapsulation;

public class Person {
    String name;
    int age;
    char gender;
    boolean isAdult;

    public void setName(String name){
        if(name.length()>=3){
            this.name= name;
        }
        else{
            System.out.println("invalid Name");
        }
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public char getGender(char gender){
        return gender;
    }
    public void setAdult(boolean isAdult){
        this.isAdult =isAdult;
    }

    public boolean isAdult() {
        return isAdult;
    }
}
