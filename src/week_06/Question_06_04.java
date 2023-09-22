package assignments.src.week_06;

import java.util.Scanner;

public class Question_06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer :");
        int number = input.nextInt();

        reverse(number);
    }

    public static void reverse(int number) {
        while (number != 0) {
            int digit = number % 10;
            System.out.print(digit);
            number /= 10;
        }
    }
}
