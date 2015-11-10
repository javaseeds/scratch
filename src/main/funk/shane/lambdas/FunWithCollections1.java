package funk.shane.lambdas;

import com.google.common.collect.Lists;
import funk.shane.model.Person;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.List;

import static java.util.Comparator.comparing;

public class FunWithCollections1 {
    public static void main(String[] args) {
        List<Person> persons = Lists.newArrayList(makePerson(), makePerson(), makePerson(), makePerson());
        display(persons);
        System.out.println();
        persons.sort(comparing(Person::getLname).thenComparing(Person::getAge));
        display(persons);
    }

    private static Person makePerson() {
        return new Person(RandomStringUtils.randomAlphabetic(10),
            RandomStringUtils.randomAlphabetic(10),
            RandomUtils.nextInt(0, 76));
    }

    private static void display(final List<Person> persons) {
        persons.forEach((x) -> System.out.println(x));
    }
}
