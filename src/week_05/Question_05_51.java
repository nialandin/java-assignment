package assignments.src.week_05;

import java.util.Scanner;

public class Question_05_51 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();
        String common = " ";

        int minLength = Math.min(str1.length(), str2.length());


        for (int i = 0; i < minLength; i++) {
            if ((str1.charAt(i)) == str2.charAt(i)) {
                common += str1.charAt(i);
            } else {
                break;
            }
        }

        if (common == " ") {
            System.out.printf("%s and %s have no common prefix", str1, str2);
        } else {
            System.out.println("The common prefix is " + common);
        }

        //welcome to c++
        //welcome to progamming
    }
}
