package assignments.src.week_02;

import java.util.Scanner;

public class Question_02_21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount : ");
        double amount = input.nextDouble();

        System.out.println("Enter annual interest rate in percentage  : ");
        double interestRate = input.nextDouble();

        System.out.println("Enter number of years  : ");
        double numberOfYears = input.nextDouble();

        double futureInvestmentValue = amount * (Math.pow((1 + (interestRate / 100)), (numberOfYears)));
        System.out.printf("Accumulated value is $" + futureInvestmentValue);

    }
}
