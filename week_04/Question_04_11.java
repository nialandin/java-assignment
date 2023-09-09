package assignments.week_04_;

import java.util.Scanner;

public class Question_04_11 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value ( 0 to 15 ) : ");

        int number = input.nextInt();

        if (number > 15) {
            System.out.println(number + " is an invalid input");
        } else {
            System.out.print("The hex value is ");
            switch (number) {
                case 10:
                    System.out.print("A");
                    break;
                case 11:
                    System.out.print("B");
                    break;
                case 12:
                    System.out.print("C");
                    break;
                case 13:
                    System.out.print("D");
                    break;
                case 14:
                    System.out.print("E");
                    break;
                case 15:
                    System.out.print("F");
                    break;
                default:
                    System.out.print(number);
            }
        }


    }

}
