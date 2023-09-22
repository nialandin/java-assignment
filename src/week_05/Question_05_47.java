package assignments.src.week_05;

import java.util.Scanner;

public class Question_05_47 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 12 digits of an ISBN-13 as a string :");

        String isbn12 = input.nextLine();

        int sum = 0;

        for (int i = 0; i < 12; i++) {
            int digit = isbn12.charAt(i) - '0';
            if (i % 2 == 0) {
                digit *= 3;
            }
            sum+= digit;
        }

        int checksum = 10 - (sum % 10);
        if (checksum == 10) {
            checksum = 0;
        }

        String isbn13 = isbn12 + checksum;

        System.out.println("The ISBN-13 number is " + isbn13);

//978013213080

    }
}
