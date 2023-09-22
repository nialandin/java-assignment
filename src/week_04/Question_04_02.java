package assignments.src.week_04;

import java.util.Scanner;

public class Question_04_02 {


    public static void main(String[] arcs) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter point 1 (latitude and longitude) in degrees : ");

        double x1 = Math.toRadians(input.nextDouble());
        double y1 = Math.toRadians(input.nextDouble());

        System.out.print("Enter point 2 (latitude and longitude) in degrees : ");

        double x2 = Math.toRadians(input.nextDouble());
        double y2 = Math.toRadians(input.nextDouble());

        double radius = 6371.01;
        double distance = radius * Math.acos(Math.sin(x1) * Math.sin(x2)
                + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        System.out.printf("The distance between the two points is %f km", distance);

// 39,55 -116,25
// 41,5 87,37


    }
}
