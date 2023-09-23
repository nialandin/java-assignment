package assignments.src.week_06;

import java.util.Scanner;

public class Question_06_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = input.nextInt();

        displayPattern(row);

    }

    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) { //4

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
