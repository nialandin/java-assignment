package assignments.src.week_04;

import java.util.Scanner;

public class Question_04_21_dön {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a SSN : ");
        String ssn = input.nextLine();


        // char c =sub1.charAt(0);

        if (ssn.length() == 11) {
            String sub1 = ssn.substring(0, 3);
            String sub2 = ssn.substring(4, 6);
            String sub3 = ssn.substring(7, 11);

            if (ssn.charAt(3) != '-') {
                System.out.println(ssn + " is an invalid social security number");

            } else if (ssn.charAt(6) != '-') {
                System.out.println(ssn + " is an invalid social security number");

            } else {
                System.out.println(ssn + " is a valid social security number");

            }
        } else
            System.out.println(ssn + " is an invalid social security number");


//232-23-5435

    }

}
