package assignments.week_05;

import java.util.Scanner;

public class Question_05_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the comission sought : ");
        double commissionSought = input.nextDouble();

        int baseSalary = 5000;
        double commission = 0;
        double salesAmount = 0;
        double targetMoney = commissionSought + baseSalary;

        while (commission < commissionSought) {
            salesAmount += 0.01;

            if (salesAmount <= 5000) {
                commission = salesAmount * 0.08;

            } else if (salesAmount <= 100000) {
                commission = 5000 * 0.08 + (salesAmount - 5000) * 0.10;
            } else {
                commission = 5000 * 0.08 + 5000 * 0.10 + (salesAmount - 100000) * 0.12;
            }
        }
        System.out.printf("Minimum sales to earn $%.1f : $%.2f", commissionSought, salesAmount);
    }
}
