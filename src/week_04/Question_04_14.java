package assignments.src.week_04;

import java.util.Scanner;

public class Question_04_14 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter grade : ");
        String letter = input.next().toUpperCase();
        char number = letter.charAt(0);


        if (Character.isLetter(number)) {

            switch (Character.toUpperCase(number)) {

                case 'A':
                    System.out.printf("The numeric value for grade %c is 4", number);
                    break;
                case 'B':
                    System.out.printf("The numeric value for grade %c is 3", number);
                    break;
                case 'C':
                    System.out.printf("The numeric value for grade %c is 2", number);
                    break;
                case 'D':
                    System.out.printf("The numeric value for grade %c is 1", number);
                    break;
                case 'F':
                    System.out.printf("The numeric value for grade %c is 0", number);
                    break;

                default:
                    System.out.printf("%s is an invalid grade", letter);
            }
        }
    }


}
