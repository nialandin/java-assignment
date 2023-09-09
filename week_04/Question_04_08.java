package assignments.week_04_;

import java.util.Scanner;

public class Question_04_08 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code:");
        int number = input.nextInt();

        char ascii = (char) number;

        System.out.printf("The character for ASCII code %d is %c ", number, ascii);


    }
}