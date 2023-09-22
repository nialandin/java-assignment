package assignments.src.week_04;

import java.util.Scanner;

public class Question_04_18_bitmedi {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters : ");
        String user = input.next();

        char major = user.toUpperCase().charAt(0);
        char number = user.charAt(1);

        switch (major) {
            case 'M':
                System.out.print("Mathematics ");
                break;
            case 'C':
                System.out.print("Computer Science ");
                break;
            case 'I':
                System.out.print("Information Technology ");
                break;
            default:
                System.out.println("Invalid input");
                number=8;
                break;
        }
        switch (number) {
            case '1':
                System.out.print("Freshman");
                break;
            case '2':
                System.out.print("Sophomore");
                break;
            case '3':
                System.out.print("Junior");
                break;
            case '4':
                System.out.print("Senior");
                break;
            default:
                System.out.println("Invalid input");

                break;
        }
        //System.out.println("Invalid input");


    }
}
