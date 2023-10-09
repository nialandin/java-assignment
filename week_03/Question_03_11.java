package assignments.src.week_03;

import java.util.Scanner;

public class Question_03_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter the month as integer: ");
        int month = input.nextInt();

        System.out.println(" Enter the year as integer: ");
        int year = input.nextInt();


        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                int day = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                int day2 = 31;
                break;
            case 2:

                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    int day3 = 29;
                } else {
                    int day4 = 28;

                }


        }

        //System.out.println( month  + " " + year + " had " + ( day || day2));

    }

}