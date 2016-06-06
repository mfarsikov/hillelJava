package java8Features;

import com.sun.org.apache.regexp.internal.REUtil;
import patterns.singleton.God;
import patterns.singleton.TheGodSingleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by MBCNEWMAIN on 06.06.2016.
 */
public class Java8Example {
    public static void main(String[] args) {
        God god = TheGodSingleton.getInstance();
        god.resurect();

        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(200, "Red", 15));
        apples.add(new Apple(250, "Green", 16));
        apples.add(new Apple(100, "Green", 11));
        apples.add(new Apple(250, "Yellow", 15));

        AppleTester greenTester = (apple, reversed) -> {
            boolean isGreen = apple.getColor().equals("Green");
            if (reversed) {
                return !isGreen;
            }else {
                return isGreen;
            }
        };

        List<Apple> greenApples = select(apples, greenTester);
        System.out.println(greenApples);

        AppleTester heavyTester = (apple, x) -> apple.getWeight() > 200;

        List<Apple> heavyApples = select(apples, heavyTester);
        System.out.println(heavyApples);
    }

    public static List<Apple> select(List<Apple> apples, AppleTester tester) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (tester.test(apple, false)) {
                result.add(apple);
            }
        }
        return result;
    }

    private static void defaultSortExample(List<Apple> apples) {
        Comparator<Apple> byColor = new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getColor().compareTo(o2.getColor()) * -1;
            }
        };

        Collections.sort(apples, byColor);
        apples.sort(byColor);

        System.out.println(apples);
    }
}
