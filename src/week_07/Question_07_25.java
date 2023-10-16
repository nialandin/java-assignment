package assignments.src.week_07;

import java.util.Scanner;

public class Question_07_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c : ");
        double[] eqn = new double[3];

        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextInt();
        }

        double[] roots = new double[2];

        int numRoots = solveQuadratic(eqn, roots);

        System.out.println("Number of real roots: " + numRoots);
        if (numRoots > 0) {
            System.out.print("The root(s) of equaiton :");
            for (int i = 0; i < numRoots; i++) {
                System.out.print(" " + roots[i]);
            }
        }
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
            return 2;
        } else if (discriminant == 0) {
            roots[0] = b / (2 * a);
            return 1;
        } else {
            return 0;
        }
    }
}
