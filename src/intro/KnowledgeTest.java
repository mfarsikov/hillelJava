package intro;

import OOP.inheritance.hierarchy.Person;

/**
 * Created by MBCNEWMAIN on 26.04.2016.
 */
public class KnowledgeTest {
    public static void main(String[] args) {
        Person person = new Person("Ivan");
        changePerson(person);
        System.out.println(person);
    }

    public static void changeName(Person person){
        person.setName("Petro");
    }

    public static void changePerson(Person person){
        person = new Person("Petro");
    }

    public static double approximate(double value) {
        return Math.round(value);
    }
}
