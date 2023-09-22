package assignments.src.week_04;

import java.util.Scanner;

public class Question_04_23 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee's name:");
        String name = input.nextLine();

        System.out.println("Enter number of hours worked in a week: ");
        double worked = input.nextDouble();

        System.out.println("Enter hourly pay rate: ");
        double hourlyPay = input.nextDouble();

        System.out.println("Enter federal tax withholding rate:");
        double federal = input.nextDouble();

        System.out.println("Enter state tax withholding rate:");
        double state = input.nextDouble();

        double grossPay = worked * hourlyPay;
        double federalWithholding = (hourlyPay * worked) * federal;
        double stateWithholding = (hourlyPay * worked) * state;


        System.out.printf("\n Employee Name : %s ", name);
        System.out.printf("\n Hourse Worked : %.1f ", worked);
        System.out.printf("\n Pay Rate : $%.2f ", hourlyPay);
        System.out.printf("\n Gross Pay: $%.2f ", grossPay);
        System.out.println("\n Deductions :");
        System.out.printf("\n  Federal Withholding (20.0%%) : $%.2f", federalWithholding);
        System.out.printf("\n State Withholding (9.0%%) : $%.2f", stateWithholding);
        System.out.printf("\n Total Deduction; $%.2f", (federalWithholding + stateWithholding));
        System.out.printf("\n Net Pay : $%.2f", ((hourlyPay * worked) - (federalWithholding + stateWithholding)));


    }
}
