package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonService {

        private final List<Person> personList = new ArrayList<>();
        private static final Random RANDOM_GENERATOR = new Random();

        public Person addPerson (Person person){
            if (person == null) {
                throw new IllegalArgumentException("Person cannot be null");
            }

            if (person.getId() != null) {
                throw new IllegalArgumentException("Person already has an ID");
            }

            long generatedId = generateRandomId();
            person.setId((int) generatedId);

            personList.add(person);
            return person;
        }
        private long generateRandomId () {
            return new Random().nextLong();
        }

        public List<Person> getAllPersons () {
            return new ArrayList<>(personList);
        }

        public List<String> getAllPersonNames () {
            List<String> allPersonNames = new ArrayList<>();
            for (Person person : personList) {
                allPersonNames.add(person.getName());
            }
            return allPersonNames;
        }
}
