package OOP.inheritance;

import OOP.inheritance.hierarchy.Employee;
import OOP.inheritance.hierarchy.Manager;
import OOP.inheritance.hierarchy.Person;

/**
 * Created by MBCNEWMAIN on 04.03.2016.
 */
public class InheritanceMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ivan");

        Employee employee = new Employee();
        employee.setPosition("programmer");
        employee.setName("Denis");

        Manager manager = new Manager();
        manager.setPosition("director");
        manager.setName("Igor");
        manager.fire(employee);

        person.getName();

        Person employeeAsPerson = employee;
        //employeeAsPerson = person;

        Person managerAsPerson = manager;

        managerAsPerson.getName();
        employeeAsPerson.getName();

        //employeeAsPerson = person;
        //employeeAsPerson.getPosition();

        //Manager personAsManager = person;


        // Employee employee1 = (Employee) employeeAsPerson;

        if (employeeAsPerson instanceof Employee) {
            System.out.println("he is employee");
        } else {
            System.out.println("he is not employee");
        }


        // System.out.println(employee1.getPosition());



        Person somebody = manager;
        somebody.greeting();

        speak(person);
        speak(employeeAsPerson);
        speak(manager);


        /*Employee employee1 = new Employee();
        employee1.name = "Ivan";

        printName(employee1);*/

        System.out.println(person.getName());
        System.out.println(employee.getName());
        System.out.println(manager.getName());

        Object o = new Employee();
        o = "SDF";

    }

    /*public static void printName(Person person){
        System.out.println("name is " + person.name);
    }*/


    public static void speak(Person person){
        person.greeting();
    }


}
