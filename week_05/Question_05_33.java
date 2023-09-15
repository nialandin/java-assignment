package assignments.week_05;

import java.util.Scanner;

public class Question_05_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;

        for (int number = 1; number <= 10000; number++) {

            int sumDivisor = 0;

            for (int divisor = 1; divisor < number; divisor++) {

                if (number % divisor == 0) {
                    sumDivisor += divisor;
                }
            }
            if (sumDivisor == number) {
                System.out.println(number);
            }


        }

        System.out.println();
    }
}