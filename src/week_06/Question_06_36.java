package assignments.src.week_06;

import java.util.Scanner;

public class Question_06_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of sides:");
        int sideNumber = input.nextInt();
        System.out.println("Enter the side:");
        double side = input.nextDouble();


        System.out.println("The area of the polygon is " + area(side));

    }
}
