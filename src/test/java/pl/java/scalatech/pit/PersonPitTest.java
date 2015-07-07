package pl.java.scalatech.pit;

import org.fest.assertions.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonPitTest {

    Person person;

    @Before
    public void init() {
        person = new PersonFactory().createPerson();
    }

    @Test
    public void test() {
        Person person = new PersonFactory().createPerson();
        String firstName = person.getFirstName();
        String lastName = person.getLastName();
        Assertions.assertThat("Last").isEqualTo(lastName);
        Assert.assertEquals("First", firstName);
        Assertions.assertThat(person.getDesc()).isEqualTo("immuture");
        Assertions.assertThat(person.getAge()).isEqualTo(10);

    }

    @Test
    //@Ignore
    public void shouldAdultTest() {
        person.setAge(19);
        Assertions.assertThat(person.getDesc()).isEqualTo("immuture");
    }

    @Test
    public void shouldAdultCheckerWork() {
        Assertions.assertThat(person.isAdultChecker(19)).isTrue();
        Assertions.assertThat(person.isAdultChecker(17)).isFalse();
        Assertions.assertThat(person.isAdultChecker(18)).isFalse();
    }

    @Test
    public void shouldNameMatchWithPattern() {
        Assertions.assertThat(person.nameCheckerByPattern("Last")).isFalse();

    }
}
