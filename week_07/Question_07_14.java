package assignments.src.week_07;

import java.util.Scanner;

public class Question_07_14 {
    public static int gcd(int... numbers) {
        Scanner input = new Scanner(System.in);

        if (numbers.length == 0) {
            System.out.println("At least one number must be provided.");
            return 0;
        }

        int result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            result = computeGcd(result, numbers[i]);
        }

        return result;
    }

    private static int computeGcd(int a, int b) {
        int gcd = 1;
        int smallerNumber = Math.min(a, b);

        for (int i = 2; i <= smallerNumber; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }

        int gcdResult = gcd(numbers);
        System.out.println("The greatest common divisor is " + gcdResult);
    }
}

