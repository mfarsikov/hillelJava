package java8Features;

import javafx.scene.layout.BorderImage;

/**
 * Created by MBCNEWMAIN on 06.06.2016.
 */
public class Apple {
    private int weight;
    private String color;
    private int price;

    public Apple(){

    }

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
        System.out.println("get price called");
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

    public boolean isGreen() {
        System.out.println("Is green called");
        return color.equals("Green");
    }

    public boolean isHeavy() {
        return weight > 200;
    }

}
