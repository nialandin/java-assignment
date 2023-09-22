package assignments.src.week_05;

import java.util.Scanner;

public class Question_05_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        for (int i = 0; i <= str.length() - 1; i += 2) {
            System.out.print(str.charAt(i));
        }
//Beijing Chicago
    }
}
