package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data @AllArgsConstructor
public class Person {

    String name;
    Integer age;
    Gender gender;
    public static final String maleSalutation = "Mr. ";
    public static final String femaleSalutation = "Mrs. ";
    public static final String otherSalutation = "Mx. ";
    public static final String unspecifiedSalutation = "Mr./Mrs./Mx. ";
    public static final String unspecifiedName = "Unspecified";

    public static List<Person> getPeople() {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Amit", 34, Gender.MALE));
        people.add(new Person("Bob", 25, Gender.OTHER));
        people.add(new Person("David", 20, Gender.MALE));
        people.add(new Person("Angela", 24, Gender.FEMALE));
        people.add(new Person("Dan", 25, Gender.MALE));
        people.add(new Person("Claire", 27, Gender.FEMALE));
        people.add(new Person("Sarah", 31, Gender.OTHER));
        people.add(new Person("April", 33, Gender.FEMALE));
        people.add(new Person("Jack", 29, Gender.MALE));

        return people;
    }

    public Person(int age) {
        this.age = age;
        this.name = unspecifiedName;
        this.gender = Gender.UNSPECIFIED;
    }

    public static Person addSalutation(Person person) {

        switch (person.getGender()) {
            case MALE:
                person.setName(maleSalutation.concat(person.getName()));
                break;
            case FEMALE:
                person.setName(femaleSalutation.concat(person.getName()));
                break;
            case OTHER:
                person.setName(otherSalutation.concat(person.getName()));
                break;
            default:
                person.setName(unspecifiedSalutation.concat(person.getName()));
                break;
        }
        return person;
    }
}
