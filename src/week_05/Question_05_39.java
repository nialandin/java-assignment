package assignments.src.week_05;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Question_05_39 {
    public static void main(String[] args) {

        int baseSalary = 5000;
        double targetMoney = 30000;

        double commission = 0;
        double salesAmount = 0;

        while (commission + baseSalary < targetMoney) {
            salesAmount += 0.01;


            if (salesAmount <= 5000) {
                commission = salesAmount * 0.08;

            } else if (salesAmount <= 100000) {
                commission = 5000 * 0.08 + (salesAmount - 5000) * 0.10;
            } else {
                commission = 5000 * 0.08 + 5000 * 0.10 + (salesAmount - 10000) * 0.12;
            }
        }
        System.out.printf("Minimum sales to earn $30,000 : %.2f", salesAmount);
    }
}
