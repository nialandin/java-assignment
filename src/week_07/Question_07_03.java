package assignments.src.week_07;

import java.util.Scanner;

public class Question_07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

/*
1 ile 100 arası sayı isteyeceğiz

 */

        int[] counts = new int[101];
        System.out.println("Enter the integers between 1 and 100 :");
        int number = input.nextInt();
        while (number != 0) {
            if (number >= 1 && number <= 100) {
                counts[number]++;
            } else {
                System.out.println("Invalid number. Enter the integers between 1 and 100 ");
            }
            number = input.nextInt();

        }
        for (int i = 0; i <= 100; i++) {
            if (counts[i] == 1) {
                System.out.printf("\n%d occurs %d time", i, counts[i]);
            } else if (counts[i] > 1) {
                System.out.printf("\n%d occurs %d times", i, counts[i]);
            }


        }
    }
}

