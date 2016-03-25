package OOP;

import java.util.Arrays;

/**
 * Created by User on 26.02.2016.
 */
public class Cat implements Comparable {
    private String color;
    private String name;
    private int birthYear;
    private String[] vaccines = new String[10];
    private int vaccineCount;

    public Cat(String name, String color, int birthYear) {
        this.name = name;
        this.color = color;
        this.birthYear = birthYear;
    }

    public void meow() {
        System.out.println("meow!");
    }

    public void vaccinate(String vaccine) {
        vaccines[vaccineCount] = vaccine;
        vaccineCount++;
        meow();
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Cat other = (Cat) o;
        if (birthYear > other.birthYear) {
            return -5;
        } else if (birthYear < other.birthYear) {
            return 32;
        }
        return 0;

        //return other.birthYear - birthYear;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "birthYear=" + birthYear +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (birthYear != cat.birthYear) return false;
        if (vaccineCount != cat.vaccineCount) return false;
        if (color != null ? !color.equals(cat.color) : cat.color != null) return false;
        if (name != null ? !name.equals(cat.name) : cat.name != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(vaccines, cat.vaccines);
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + birthYear;
        result = 31 * result + Arrays.hashCode(vaccines);
        result = 31 * result + vaccineCount;
        return result;
    }
}
