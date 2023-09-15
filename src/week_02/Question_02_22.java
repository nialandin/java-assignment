package week_02;

import java.util.Scanner;

public class Question_02_22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount as integer, for example 1156 for 11.56: ");
        int totalCent = input.nextInt();

        int dollars = totalCent / 100;
        int remainingMoney = totalCent % 100;

        int quarters = remainingMoney / 25;
        remainingMoney = remainingMoney % 25;

        int dimes = remainingMoney / 10;
        int remainingDimes = remainingMoney % 10;

        int nickels = remainingMoney / 5;
        int pennies = remainingMoney % 5;

        System.out.println("Your amount 1156 consists of");
        System.out.println(dollars + " dollars");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");


    }
}
