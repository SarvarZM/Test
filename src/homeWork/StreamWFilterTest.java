package homeWork;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamWFilterTest {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("John", 28, Arrays.asList(new Address("New York", "USA"), new Address("Boston", "USA"))),
                new Person("Jane", 22, Arrays.asList(new Address("London", "UK"), new Address("Manchester", "UK"))),
                new Person("Alice", 35, Arrays.asList(new Address("Sydney", "Australia"))),
                new Person("Bob", 40, Arrays.asList(new Address("Paris", "France"), new Address("Lyon", "France"))));

        List<String> results =persons.stream()
                .filter(x-> x.getAge()>30)
                        .map(Person::getName).collect(Collectors.toList());

        System.out.println(results);


       List<Object> cities= persons.stream()
               .flatMap(person -> person.getAddresses().stream())





    }
}
