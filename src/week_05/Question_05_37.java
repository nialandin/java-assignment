package assignments.src.week_05;

import java.util.Scanner;

public class Question_05_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a decimial interger : ");
        int decimal = input.nextInt();

        String binary = " ";
        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal /= 2;

        }

    }
}
