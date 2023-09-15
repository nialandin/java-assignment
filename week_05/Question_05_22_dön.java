package assignments.week_05;

import java.util.Scanner;

public class Question_05_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Loan Amount : ");
        double loanAmount = input.nextDouble();

        System.out.println("Number Of Years :");
        int years = input.nextInt();

        System.out.println("Annual Interest Rate :");
        int interestRate = input.nextInt();

        System.out.println("Annual Interest Rate :");
        double monthlyPayment = input.nextDouble();

        System.out.println("Annual Interest Rate :");
        double totalPayment = input.nextDouble();


        double monthlyInterest = monthlyPayment / 1200;

    }
}