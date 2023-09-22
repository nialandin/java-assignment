package assignments.src.week_05;

import java.util.Scanner;

public class Question_05_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0.0;

        for (int i = 1; i <= 97; i += 2) {
            double term = (double) i / (i + 2);
            sum += term;
        }
        System.out.println("Sum og the series: " + sum);
    }
}
