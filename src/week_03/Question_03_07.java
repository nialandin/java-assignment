package week_03;

import java.util.Scanner;

public class Question_03_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount ( e.g 11,56 ): ");
        double amount = input.nextDouble();
        double many = amount * 100;

        double dolar = amount / 100;
        double remainingMoney = amount % 100;

        double quarters = remainingMoney / 25;
        remainingMoney = remainingMoney % 25;

        double dimes = remainingMoney / 10;
        double remainingDimes = remainingMoney % 10;

        double nickels = remainingMoney / 5;
        double pennies = remainingMoney % 5;

        System.out.println("Your amount 1156 consists of");
        System.out.println( dolar + " dollars");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");





    }

}
