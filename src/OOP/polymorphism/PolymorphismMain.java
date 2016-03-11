package OOP.polymorphism;

import OOP.inheritance.hierarchy.Employee;
import OOP.inheritance.hierarchy.Person;

/**
 * Created by MBCNEWMAIN on 11.03.2016.
 */
public class PolymorphismMain {
    public static void main(String[] args) {
        Object o = new Object();

        print(o);

        print(new Person("Vasya"));

        print(new Employee("Vanya"));

        Object[] objects = new Object[3];

        objects[0] = o;
        objects[1] = new Person("Petya");
        objects[2] = new Employee("Vasya");

        print(objects);

        System.out.println("Person Vasya contains in array: " + contains(objects, new Person("Vasya")) );
    }

    public static void print(Object o){
        System.out.println(o);
    }

    public static void print(Object[] objects){
        for(Object o : objects){
            System.out.println(o);
        }
    }

    public static boolean contains(Object[] objects, Object o){
        for (Object object : objects){
            if(object.equals(o)){
                return true;
            }
        }
        return false;
    }
}
