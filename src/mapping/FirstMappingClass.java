package mapping;

import model.Gender;
import model.Person;

import java.util.stream.IntStream;

import static model.Person.getPeople;
import static model.Person.maleSalutation;

public class FirstMappingClass {

    public static void main(String[] args) {

        //@formatting:off
        getPeople().stream().filter(person -> person.getGender().equals(Gender.MALE))
                .map(person -> maleSalutation.concat(person.getName()))
                .forEach(System.out::println);

        IntStream.range(20, 30).mapToObj(Person::new)
                .map(Person::addSalutation)
                .forEach(System.out::println);
        //@formatting:on
    }
}
