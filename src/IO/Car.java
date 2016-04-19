package IO;

import OOP.inheritance.hierarchy.Person;

import java.io.Serializable;

/**
 * Created by MBCNEWMAIN on 19.04.2016.
 */
public class Car implements Serializable {
    private final String brand;
    private final int year;
    private final Person owner;
    private transient Rentor rentor;

    public Car(String brand, int year, Person owner) {
        this.brand = brand;
        this.year = year;
        this.owner = owner;
    }

    public void setRentor(Rentor rentor) {
        this.rentor = rentor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", owner=" + owner +
                ", rentor=" + rentor +
                '}';
    }
}
