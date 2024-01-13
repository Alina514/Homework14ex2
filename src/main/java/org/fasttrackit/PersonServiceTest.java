package org.fasttrackit;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonServiceTest {

    @Test
    public void testAddPerson() {
            PersonService personService = new PersonService();
            Person person = new Person();
            person.setId(123);
            person.setName("Ion");
            person.setAge(30);

            assertThrows(IllegalArgumentException.class, () -> {
                personService.addPerson(person);
            });

    }
    @Test
    public void testGetAllPersons() {
        PersonService personService = new PersonService();

        Person person1 = personService.addPerson(new Person("Mihai", 25));
        Person person2 = personService.addPerson(new Person("Elena", 30));
        Person person3 = personService.addPerson(new Person("Tudor", 35));

        List<Person> allPersons = personService.getAllPersons();

        assertTrue(allPersons.contains(person1));
        assertTrue(allPersons.contains(person2));
        assertTrue(allPersons.contains(person3));

        assertEquals(3, allPersons.size());
    }
    private void assertTrue(boolean contains) {

    }
    @Test
    public void testGetAllPersonNames() {
        PersonService personService = new PersonService();

        Person person1 = personService.addPerson(new Person("Mihai", 25));
        Person person2 = personService.addPerson(new Person("Elena", 30));
        Person person3 = personService.addPerson(new Person("Tudor", 35));


        List<String> allPersonNames = personService.getAllPersonNames();

        assertNotNull(allPersonNames);
        assertTrue(allPersonNames.contains(person1.getName()));
        assertTrue(allPersonNames.contains(person2.getName()));
        assertTrue(allPersonNames.contains(person3.getName()));

        assertEquals(3, allPersonNames.size());
    }

}
