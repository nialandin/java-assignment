package assignments.week_04_;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question_04_13 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter : ");
        String letter = input.next();
        char c = letter.charAt(0);
        char upperCase = (Character.toUpperCase(c));
        if (Character.isLetter(c)) {
            switch (upperCase) {
                case 'A':
                case 'E':
                case 'I':
                case 'U':
                case 'O':
                    System.out.println(upperCase + " is a vowel");
                    break;
                default:
                    System.out.println(upperCase + " is a consonant");

            }
        } else
            System.out.println( upperCase  + " is an invalid input");
    }

}
