package assignments.src.week_02;

import java.util.Scanner;

public class Question_02_04 {
    public static void main ( String [] args ){
        Scanner input = new Scanner(System.in);

        double pound = input.nextDouble();
        double kilogram = pound * 0.454;

        System.out.println("Enter a number in pounds: "+ pound);
        System.out.println(pound + " pounds is " + kilogram + " kilograms");



    }



}
