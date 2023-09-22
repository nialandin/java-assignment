package assignments.src.week_05;

import java.util.Scanner;

public class Question_05_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = input.nextLine();
        String reversed = " ";

//hello
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);

        }
        System.out.println("The reversed string is " + reversed);
    }
}
