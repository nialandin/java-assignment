package assignments.src.week_05;

import java.util.Scanner;

public class Question_05_19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the line");
        int line = input.nextInt();
        for (int i = 0; i <= line; i++) {

            for (int j = line; j > i; j--) {
                System.out.printf("%-5s", " ");
            }
            int number = 1;
            for (int j = 1; j <= i + 1; j++) {
                // double üs = (Math.pow(2,i));
                System.out.printf("%-5d", number);
                number *= 2;
            }
            number /= 4;
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-5d", number);
                number /= 2;
            }
            System.out.println();

        }
    }
}
