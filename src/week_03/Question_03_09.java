package week_03;

import java.util.Scanner;

public class Question_03_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int isbn = input.nextInt();

        int d9 = isbn % 10;
        int isbnDigit = isbn / 10;
        int d8 = isbnDigit % 10;
        isbnDigit = isbnDigit / 10;
        int d7 = isbnDigit % 10;
        isbnDigit = isbnDigit / 10;
        int d6 = isbnDigit % 10;
        isbnDigit = isbnDigit / 10;
        int d5 = isbnDigit % 10;
        isbnDigit = isbnDigit / 10;
        int d4 = isbnDigit % 10;
        isbnDigit = isbnDigit / 10;
        int d3 = isbnDigit % 10;
        isbnDigit = isbnDigit / 10;
        int d2 = isbnDigit % 10;
        isbnDigit = isbnDigit / 10;
        int d1 = isbnDigit % 10;
        isbnDigit = isbnDigit / 10;

        int checksum = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) +
                (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11;

        int lastDigit;
        if (checksum == 10) {
            lastDigit = 10;
        } else {
            lastDigit = checksum;
        }


        System.out.println("The 10-digit ISBN is :" + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + (lastDigit == 10 ? "X " : lastDigit));

    }
}
