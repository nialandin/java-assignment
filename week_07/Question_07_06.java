package assignments.src.week_07;

import java.util.Scanner;

public class Question_07_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] primeNumbers = new int[50];
        int count = 0;
        int num = 2;

        while (count < 50) {
            if (isPrime(num)) {
                primeNumbers[count] = num;
                count++;
            }
            num++;
        }
        for (int prime : primeNumbers) {
            System.out.printf("%5d ", prime);
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
