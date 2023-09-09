package assignments.week_05;

import java.util.Scanner;

public class Question_05_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Loan Amount : ");
        double loanAmount = input.nextDouble();

        System.out.println("Number Of Years");
        int years = input.nextInt();

        double interestRate = 5.0;


        while (interestRate <= 8.0) {
            //aylık faiz oranı
            double monthlyInterestRite = interestRate / 1200;
            //aylık ödeme
            double monthlyPayment = loanAmount * monthlyInterestRite / (1 - 1 / Math.pow(1 + monthlyInterestRite, years * 12));

            //toplam ödeme
            double totalPayment = monthlyPayment * years * 12;

            System.out.printf("%.3f%%\t\t$%.2f\t\t$%.2f\n"
                    , interestRate, monthlyPayment, totalPayment);

            interestRate += 0.125;

        }

    }
}
