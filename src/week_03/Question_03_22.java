package assignments.src.week_03;

import java.util.Scanner;

public class Question_03_22 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates: ");
        double p1 = input.nextInt();
        double p2 = input.nextInt();


        double distance = Math.sqrt(((p1 - 0) * (p1 - 0)) + ((p2 - 0) * (p2 - 0)));

        if (distance <= 10) {
            System.out.println("Point (" + p1 + "  " + p2 + ") is in the circle ");
        } else {
            System.out.println("Point (" + p1 + "  " + p2 + ") is not in the circle ");
        }

    }
}
