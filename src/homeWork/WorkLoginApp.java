package homeWork;

public class WorkLoginApp {
    public static void main(String[] args) {
        Users user1 = new Users("John Doe","john.doe","abc",10);
        Users user2 = new Users("Patel Harsh","patel.harsh","123abc",11);
        Users user3 = new Users("Kim Yan","kim.yan","admin",12);
        Users user4 = new Users("Brad Pitt","brad.pitt","abcdef",13);
        Users user5 = new Users("David Clark","david.clark","123456",14);

        Users[] users ={user1,user2,user3,user4,user5};
/*
        for(Users user: users){
            if(user.id % 2 == 0){
                System.out.println(user.fullName);
            }
        }
*/
        for(Users user: users){
  //          if(user.fullName.substring(0,user.fullName.in < 4));
        }

    }
}
