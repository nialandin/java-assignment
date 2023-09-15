package assignments.week_04_;

import java.util.Scanner;

public class Question_04_01 {

    public static void main(String[] arcs) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the length from the center to a vertex : ");
        double r = input.nextDouble();

        double side = 2 * r * Math.sin(Math.PI / 5);
        double area = (5 * side * side) / (4 * Math.tan(Math.PI / 5));

        System.out.printf("The area of the pentagon is %.2f", area);


    }
}
