import java.awt.desktop.AppForegroundListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Apple apple = new Apple();
        Orange orange = new Orange();
        for (int i = 0; i < 10; i++) {
            appleBox.add(apple);
            orangeBox.add(orange);
        }
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.getWeight());

        System.out.println(appleBox.compare(orangeBox.getWeight2()));

        Box<Apple> appleBox2 = new Box<>();
        appleBox.sprinkle(appleBox2.getBox());


    }
}
