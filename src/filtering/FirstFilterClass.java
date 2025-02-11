package filtering;

import model.Person;

import java.util.List;
import java.util.stream.LongStream;

import static model.Person.getPeople;

public class FirstFilterClass {

    static boolean firstFilterMethod(Person person) {

        return person.getAge() % 2 == 0 && person.getName().length() >= 4;
    }

    public static void main(String[] args) {

        //@formatter:off
        LongStream.range(1, 10)
                .filter(a -> a % 2 == 0)
                .forEach(System.out::println);

        var list1 = List.of("Hello", "World", "Java", "Python", "C++", "C#");
        list1.stream().filter(str -> str.length() == 3).forEach(System.out::println);

        getPeople().stream()
                .filter(person -> person.getAge() < 30)
                .forEach(System.out::println);
        System.out.println();
        getPeople().stream()
                .filter(person -> person.getAge() < 30 && person.getAge() > 23)
                .forEach(System.out::println);
        System.out.println();
        getPeople().stream()
                .filter(FirstFilterClass::firstFilterMethod)
                .forEach(System.out::println);
        System.out.println();
        //@formatter:on
    }
}
