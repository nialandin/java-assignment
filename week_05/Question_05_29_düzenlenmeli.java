package assignments.week_05;

import java.util.Scanner;

public class Question_05_29 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter year : ( e. g., 2012 ):");
        int year = input.nextInt();

        System.out.print("Enter first day of the year: ");
        int firstDay = input.nextInt();


        String dayName = "";
        int dayNumber = firstDay;
int monthDay = 0;
        for (int month = 1; month < 13; month++) {

            switch (month) {
                case 1:
                    System.out.println("January" + monthDay );
                    monthDay =  31;
                    System.out.println();
                case 2:
                    System.out.println("February" + monthDay );

                    if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
                        monthDay= 29;

                    } else monthDay =28;
                    break;
                case 3:
                    System.out.println("March" + year );
                    monthDay =  31;
                    break;
                case 4:
                    System.out.println("April" + year );
                    monthDay =  31;
                    break;
                case 5:
                    System.out.println("May" + year );
                    monthDay =  30;
                    break;
                case 6:
                    System.out.println("June" +year );
                    monthDay =  31;
                    break;
                case 7:
                    System.out.println("July" +year );
                    monthDay =  30;
                    break;
                case 8:
                    System.out.println("August" + year );
                    monthDay =  31;
                    break;
                case 9:
                    System.out.println("September" + year );
                    monthDay =  30;
                    break;
                case 10:
                    System.out.println("October" + year );
                    monthDay =  31;
                    break;
                case 11:
                    System.out.println("November" + year );
                    monthDay =  30;
                    break;
                case 12:
                    System.out.println("December" + year );
                    monthDay =  31;
                    break;
            }

            System.out.println("-----------------------------------------------------------------------");

            System.out.println("   Sun  Mon  Tue  Wed  Thu  Fri  Sat");

           for (int i = 0; i < dayNumber; i++) {
                System.out.printf("%-8s" , " ");
            }
            for (int i = 1; i <= monthDay ; i++) {
                System.out.printf("%5d", i);
dayNumber++;
dayNumber = dayNumber %7;
if (dayNumber == 0) {
    System.out.println();
}
            }

        }




    }
}