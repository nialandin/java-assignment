package assignments.week_10;

import java.util.Scanner;

public class Circle2DTest {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("Circle1 area:" + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Does circle1 contain the point (3, 3)? --> " + c1.contains(3, 3));

        Circle2D c2 = new Circle2D(4, 5, 10.5);
        Circle2D c3 = new Circle2D(3, 5, 2.3);
        System.out.println("Does circle1 contain the circle centered at (4, 5) and radius 10.5? --> " + c1.contains(c2));
        System.out.println("Does circle1 overlap the circle centered at (3, 5) and radius 2.3? --> " + c1.overlaps(c3));

    }
}
