package OOP;

/**
 * Created by User on 26.02.2016.
 */
public class Rectangle {
    static int sides = 4;

    int width;
    int height;
    String color;

    public int calculateArea() {
        return width * height;
    }

    public void changeSidesConunt(){
        sides = sides + 1;
    }
}
