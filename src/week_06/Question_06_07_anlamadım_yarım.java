package assignments.src.week_06;

import java.util.Scanner;

public class Question_06_07_anlamadım_yarım {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested : ");
       double investmentAmount = input.nextDouble();
        System.out.print("Annual interest rate :");
        double monthlyInterestRate = input.nextDouble() / 1200;


        for (int years = 1; years <= 30; years++) {
            double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);

         //   System.out.printf("%-10d $%s%n", years, futureInvestmentValue(investmentAmount)));
        }
        }
    //}
    public static double futureInvestmentValue (double investmentAmount , double monthlyInterestRate , int years){
        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
        return futureValue;
    }
}
