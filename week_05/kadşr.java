package assignments.week_05;

import java.util.Scanner;

public class kadşr {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the number of lines: ");
        int lines = input.nextInt();

        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= (lines - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");

            }


            System.out.println();

        }
    }

    }
