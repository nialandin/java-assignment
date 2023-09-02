package week_03;

import java.util.Scanner;

public class Question_03_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three-digit integer: ");
        int number = input.nextInt();

        int d1 = number % 10;
        int remainder = number / 10;
        int d2 = remainder % 10;
        int d3 = remainder / 10;

        if (d1 == d3) {
            System.out.println(number + " is a palindrome ");
        } else {
            System.out.println(number + " is not palindrome ");
        }

    }

}


