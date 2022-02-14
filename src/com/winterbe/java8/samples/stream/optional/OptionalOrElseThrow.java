package com.winterbe.java8.samples.stream.optional;

import com.winterbe.java8.samples.stream.optional.exceptions.PersonNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class OptionalOrElseThrow {

    public static String getPersonById(List<Person> persons, Long personId) throws PersonNotFoundException {
        return persons.stream()
                .filter(person -> person.getId() == personId)
                .findFirst()
                .map(Person::getpersonName).orElseThrow(PersonNotFoundException::new);
    }

    public static void main(String[] args) {

        persons.add(new Person(1L, "Ercan"));
        persons.add(new Person(2L, "Jack"));
        persons.add(new Person(3L,"David"));
        System.out.println(getPersonById(persons,2L));

    }

    // Person Class
    public static class Person {
        private Long id;
        private String personName;

        public Person(Long id, String personName) {
            this.id = id;
            this.personName = personName;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getpersonName() {
            return personName;
        }

        public void setpersonName(String personName) {
            this.personName = personName;
        }
    }

}
