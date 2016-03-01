package OOP;

/**
 * Created by User on 26.02.2016.
 */
public class Rectangle {
    static final int SIDES_OF_RECTANGLE = 4;

    private int width;
    private int height;
    private String color;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }

    public boolean equals(Rectangle other) {
        return width == other.width && height == other.height;
    }
}
