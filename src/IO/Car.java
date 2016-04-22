package IO;

import OOP.inheritance.hierarchy.Person;

import java.io.Serializable;

/**
 * Created by MBCNEWMAIN on 19.04.2016.
 */
public class Car implements Serializable {
    private static final long serialVersionUID = 1;
    private final String brand;
    private final Person owner;
    private final int year2;
    private transient Tenant tenant;

    public Car(String brand, int year, Person owner) {
        System.out.println("in car constructor with three parameters");
        this.brand = brand;
        this.year2 = year;
        this.owner = owner;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year2=" + year2 +
                ", owner=" + owner +
                ", tenant=" + tenant +
                '}';
    }
}
