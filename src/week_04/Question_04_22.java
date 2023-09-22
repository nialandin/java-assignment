package assignments.src.week_04;

import java.util.Scanner;

public class Question_04_22 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string s1 : ");
        String s1 = input.nextLine().toUpperCase();

        System.out.print("Enter string s2 : ");
        String s2 = input.nextLine().toUpperCase();

        if (s1.contains(s2)) {
            System.out.printf("%s is a substring of %s ", s2, s1);

        } else if (s2.contains(s1)) {
            System.out.printf("%s is a substring of %s ", s2, s1);
        } else
            System.out.printf("%s is not a substring of %s ", s2, s1);

    }
}
