package encapsulation;

public class TestPeople {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("John");
        person1.setAge(20);
        person1.setGender('M');
        person1.setAdult(true);

        Person person2 = new Person();
        person1.setName("Patel");
        person2.setAge(25);
        person2.setGender('M');
        person2.setAdult(true);

        Person person3 = new Person();
        person1.setName("Kim");
        person2.setAge(16);
        person2.setGender('M');
        person2.setAdult(false);

        Person person4 = new Person();
        person1.setName("Kate");
        person2.setAge(28);
        person2.setGender('F');
        person2.setAdult(true);

        Person[] people ={person1,person2,person3,person4};

        for(int i =0;i<people.length;i++){
            if (people[i].getAge()>= 25)
                System.out.println(people[i].getName());

        }
        for (int i=0;i<people.length;i++){
            if(people[i].gender == 'M' && people[i].getName().contains("o")) {


                System.out.println(people[i].getName());
            }
        }
    }


}
