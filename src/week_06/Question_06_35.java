package assignments.src.week_06;

import java.util.Scanner;

public class Question_06_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the side:");
        double side = input.nextDouble();

        System.out.println("The area of the pentagon is " + area(side));
    }

    public static double area(double side) {
        double tan = 3.14159 / 5;
        double area = (5 * side * side) / (4 * Math.tan(tan));

        return area;
    }
}
