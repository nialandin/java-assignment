package assignments.src.week_03;

import java.util.Scanner;

public class Question_03_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("( 0-single filer, 1-married jointly or Qualifying widow(er), 2-married sparately, 3-head of household)" +
                "\nEnter the filing status: ");
        int status = input.nextInt();

        System.out.println("Enter your income -> ");
        double income = input.nextDouble();



        double tax = 0;
        if (status == 0) {
            if (income <= 8350) {
                tax = income * 0.10;
            } else if (income <= 33950) {
                tax = (8350 * 0.10) + ((income - 8350) * 0.15);
            } else if (income <= 82250) {
                tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((income - 33950) * 0.25);
            } else if (income <= 171550) {
                tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((82250 - 33950) * 0.25) + ((income - 82250) * 0.28);
            } else if (income <= 171551) {
                tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((82250 - 33950) * 0.25) + ((171550 - 82250) * 0.28) +
                        ((income - 171550) * 0.33);
            } else {
                tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((82250 - 33950) * 0.25) + ((171550 - 82250) * 0.28) +
                        +((372950 - 171550) * 0.33) + ((income - 372950) * 0.35);
            }


        } else if (status == 1) {
                if (income <= 16700) {
                    tax = income * 0.10;
                } else if (income <= 67900) {
                    tax = (16700 * 0.10) + ((income - 16700) * 0.15);
                } else if (income <= 137050) {
                    tax = (16700 * 0.10) + ((67900 - 16700) * 0.15) + ((income - 67900) * 0.25);
                } else if (income <= 208850) {
                    tax = (16700 * 0.10) + ((67900 - 16700) * 0.15) + ((137050 - 67900) * 0.25) + ((income - 137050) * 0.28);
                } else if (income <= 372950) {
                    tax = (16700 * 0.10) + ((67900 - 16700) * 0.15) + ((137050 - 67900) * 0.25) + ((208851 - 137050) * 0.28) +
                            ((income - 171550) * 0.33);
                } else {
                    tax = (16700 * 0.10) + ((67900 - 16700) * 0.15) + ((137050 - 67900) * 0.25) + ((208851 - 137050) * 0.28) +
                            +((372950 - 171550) * 0.33) + ((income - 372950) * 0.35);
                }

        } else if (status == 2) {if (income <= 8350) {
            tax = income * 0.10;
        } else if (income <= 33950) {
            tax = (8350 * 0.10) + ((income - 8350) * 0.15);
        } else if (income <= 68525) {
            tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((income - 33950) * 0.25);
        } else if (income <= 104425) {
            tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((68525 - 33950) * 0.25) + ((income - 68525) * 0.28);
        } else if (income <= 171551) {
            tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((68525 - 33950) * 0.25) + ((104425 - 68525) * 0.28) +
                    ((income - 171550) * 0.33);
        } else {
            tax = (8350 * 0.10) + ((33950 - 8350) * 0.15) + ((68525 - 33950) * 0.25) + ((104425 - 68525) * 0.28) +
                    +((372950 - 104425) * 0.33) + ((income - 372950) * 0.35);
        }

        } else if (status == 3) {
        } else {
            System.out.println(" İnvalid status! ");
            System.exit(1);

        }

        System.out.println(" Tax is -> " + tax);
        System.out.println(" after if-else block chain! ");

    }
}