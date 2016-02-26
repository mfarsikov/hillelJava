package OOP;

import java.util.Arrays;

/**
 * Created by User on 26.02.2016.
 */
public class VetClinic {
    public static void main(String[] args) {
        Cat catTom = new Cat("Tom", "Blue", 2015);

        catTom.vaccinate("SACC");

        System.out.println(catTom.getBirthYear());

        String name = catTom.getName();

        catTom.setName("Murzik");

        System.out.println(catTom.getName());

        String newName = name.replace('T', 'K');
    }


}
