package assignments.week_05;

import java.util.Scanner;

public class Qustion_05_36_hataverşyor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // sayıları alıp formulde i yapmam lazım

        System.out.print("Enter the first 9 digits of an ISBN as integer :");
        String isbnNumber = input.nextLine();
        int sum = 0;


        for (int i = 0; i <= 9; i++) {

            for (int j = 1; j <= 9; j++) {
            char c = isbnNumber.charAt(i);
                int digit = Character.getNumericValue(c);
               int formal = (digit * j);
               sum += formal;
            }

        }
        int digitSum = sum % 11;

        if (digitSum == 10) {
            System.out.println(isbnNumber + "X");
        } else {
            System.out.println(isbnNumber + digitSum);
        }
    }

}
