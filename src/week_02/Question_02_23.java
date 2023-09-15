package week_02;

import java.util.Scanner;

public class Question_02_23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the driving distance : ");
        double distance = input.nextDouble();
        System.out.println("Enter miles per gallon");
        double gallon = input.nextDouble();

        System.out.println("Enter price per gallon : ");
        double priceGallon = input.nextDouble();

        double yakıt = distance / gallon;
        double yakıtParası = yakıt * priceGallon;

        System.out.printf("The cost of driving is $%.2f ", yakıtParası);


    }

}
