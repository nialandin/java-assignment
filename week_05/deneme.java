package assignments.week_05;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        double sum = 0.0;
        int m = 3;

        for (int i = 1; i <= n; i++) {
            sum += (double) i / m;
            m += 2;
        }

        System.out.println("The summation result is: " + sum);
    }
}

