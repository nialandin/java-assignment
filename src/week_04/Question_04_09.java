package assignments.week_04_;

import java.util.Scanner;

public class Question_04_09 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character :");
        String digit = input.nextLine();
        char code = digit.charAt(0);
        int c = code;
        System.out.printf("The unicode for the character %c is %d", code, c);
    }

}
