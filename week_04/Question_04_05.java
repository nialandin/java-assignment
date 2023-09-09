package assignments.week_04_;

import java.util.Scanner;

public class Question_04_05 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of side :");
        double sideNumber = input.nextDouble();

        System.out.print("Enter the side :");
        double side = input.nextDouble();

        double area = (sideNumber * side * side) / (4 * Math.tan(Math.PI / sideNumber));

        System.out.printf("The area of the polygon is %f", area);


    }

}
