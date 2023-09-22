package assignments.src.week_06;

import java.util.Scanner;

public class Question_06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer : ");
        int number = input.nextInt();

        String isPalindrome = isPalindrome(number) ? " is a palindrome" : " is not a palindrome";
        System.out.println(number + isPalindrome);
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;

    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = reverse(number);
        return number == reversedNumber;
    }

}
