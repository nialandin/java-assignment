package assignments.src.week_05;

import java.util.Scanner;

public class Question_05_36 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // sayıları alıp formulde i yapmam lazım

        System.out.print("Enter the first 9 digits of an ISBN as integer :");
        String isbnNumber = input.nextLine();
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            char c = isbnNumber.charAt(i);
            int digit = Character.getNumericValue(c);
            int formal = digit * (i + 1);
            sum += formal;
        }

        int digitSum = sum % 11;

        if (digitSum == 10) {
            System.out.println(isbnNumber + "X");
        } else {
            System.out.println(isbnNumber + digitSum);
        }
        //013601267
        //013031997
    }
}
