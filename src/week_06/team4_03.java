package assignments.src.week_06;

import java.util.Scanner;

public class team4_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an string : ");
        String str = input.nextLine();

        if (isPalindrome(str)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }


    }

    public static boolean isPalindrome(String str) {
        //nazan

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;


    }

}
