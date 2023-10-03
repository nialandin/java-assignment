package assignments.src.week_06;

import java.util.Scanner;

public class Question_06_39 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1 and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double position = calculatePosition(x0, y0, x1, y1, x2, y2);
        if (position < 0) {
            System.out.println("p2 is on the right of the line.");
        } else if (position == 0) {
            System.out.println("p2 is on the line.");
        } else {
            System.out.println("p2 is on the left of the line.");
        }
    }


    public static double calculatePosition(double x0, double y0, double x1, double y1, double x2, double y2) {
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
    }
}

