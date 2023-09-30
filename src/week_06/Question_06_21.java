package assignments.src.week_06;

import java.util.Scanner;

public class Question_06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string :");
        String str = input.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                System.out.print(getNumber(str.toLowerCase().charAt(i)));
            } else System.out.print(str.charAt(i));
        }
    }

    public static int getNumber(char lowercaseLetter) {
        int number = 0;
        if (lowercaseLetter == 'a' || lowercaseLetter == 'b' || lowercaseLetter == 'c') {
            number = 2;
        } else if (lowercaseLetter == 'd' || lowercaseLetter == 'e' || lowercaseLetter == 'f') {
            number = 3;
        } else if (lowercaseLetter == 'g' || lowercaseLetter == 'h' || lowercaseLetter == 'i') {
            number = 4;
        } else if (lowercaseLetter == 'j' || lowercaseLetter == 'k' || lowercaseLetter == 'l') {
            number = 5;
        } else if (lowercaseLetter == 'm' || lowercaseLetter == 'n' || lowercaseLetter == 'o') {
            number = 6;
        } else if (lowercaseLetter == 'p' || lowercaseLetter == 'q' || lowercaseLetter == 'r' || lowercaseLetter == 's') {
            number = 7;
        } else if (lowercaseLetter == 't' || lowercaseLetter == 'u' || lowercaseLetter == 'v') {
            number = (8);
        } else if (lowercaseLetter == 'w' || lowercaseLetter == 'x' || lowercaseLetter == 'y' || lowercaseLetter == 'z') {
            number = 9;
        } else if (lowercaseLetter == '_' || lowercaseLetter == ',' || lowercaseLetter == '@') {
            number = 1;
        }
        return number;
    }
}
