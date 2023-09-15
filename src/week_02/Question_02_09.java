package week_02.assignments.assignments.nia;

import java.util.Scanner;

public class Question_02_09 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double ivme = (v1 - v0) / t;

        System.out.println("Enter v0, v1 and t : " + v0 + "  " + v1 + "  " + "  " + t);
        System.out.println("The average acceleration is " + ivme );
//5,5 50,9 4,5

    }
}