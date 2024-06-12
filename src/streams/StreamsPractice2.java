package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPractice2 {
    public static void main(String[] args) {
        Parent parent1 = new Parent("John Doe",'M',new ArrayList<>(List.of("Bob","Richard","Michael")));
        Parent parent2 = new Parent("Patel Harsh",'M',new ArrayList<>(List.of("Skikkanth","Sumathi","Suresh")));
        Parent parent3 = new Parent("Kate Paterson",'F',new ArrayList<>(List.of("Jessica","Charles")));

        List<Parent> parents = List.of(parent1,parent2,parent3);

        List<String> children= parents.stream()
                .flatMap(x-> x.getChildren().stream())
                .collect(Collectors.toList());

        System.out.println(children);

        List<String> malesChildren = parents.stream()
                .filter(x-> x.getGender()==('M'))
                .flatMap(x->List.of(x.getChildren().get(0)).stream())
                .collect(Collectors.toList());

        System.out.println(malesChildren);

        List<String> parentWithChildC = parents.stream()
                .filter(x -> x.getChildren().stream().filter(z-> z.startsWith("C")).count()>=1)
                .map(x-> x.getName().substring(0,x.getName().indexOf(" ")))
                        .collect(Collectors.toList());


        System.out.println(parentWithChildC);





    }
}
