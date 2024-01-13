package org.fasttrackit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class PersonTest {

    @Test
    public void testInvalidAge() {
        assertThrows(IllegalArgumentException.class, () -> {
            Person person = new Person();
            person.setName("Marius");
            person.setAge(-4);
        });
    }

    @Test
    public void testNullName() {
        assertThrows(IllegalArgumentException.class, () -> {
            Person person = new Person();
            person.setName("Alin");
            person.setAge(25);
        });
    }
}
