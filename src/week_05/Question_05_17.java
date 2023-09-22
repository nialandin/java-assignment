package assignments.src.week_05;

import java.util.Scanner;

public class Question_05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the number of lines: ");
        int lines = input.nextInt();

        for (int i = 1; i <= lines; i++) {

            for (int j = 1; j <= (lines - i); j++) {
                System.out.printf("%-3s", " ");
            }
            for (int j = i; j > 0; j--) {
                System.out.printf("%-3d", j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.printf("%-3d", j);
            }
            System.out.println();
        }
    }
}
