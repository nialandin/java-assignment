package assignments.src.week_02;

import java.util.Scanner;

public class Question_02_05 {
    public static void main (String [] args ) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter the subtotal and gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();

        double tip = subtotal / 100 * gratuity;
        double total = tip + subtotal;


        System.out.println("The gratuity is $" +tip + " and total is $"
                +total );




    }



}
