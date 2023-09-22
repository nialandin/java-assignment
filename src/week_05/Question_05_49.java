package assignments.src.week_05;

import java.util.Scanner;

public class Question_05_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else if (Character.isLetter(ch)) {
                consonantCount++;
            }
        }
        System.out.println("Number of vowels is " + vowelCount);
        System.out.println("Number of consonants is " + consonantCount);

        //Programming is fun
    }
}
