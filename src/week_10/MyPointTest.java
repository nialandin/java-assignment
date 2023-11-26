package assignments.week_10;

public class MyPointTest {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(0, 0);
        MyPoint point2 = new MyPoint(10, 30.5);

        double distance = point1.distance(point2);
        System.out.println("The distance between (0.0, 0.0) and (10.0, 30.5) is : " + distance);
    }
}



