package java8Features;

/**
 * Created by MBCNEWMAIN on 06.06.2016.
 */
public class Apple {
    private int weight;
    private String color;
    private int price;

    public Apple(int weight, String color, int price) {
        this.weight = weight;
        this.color = color;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
