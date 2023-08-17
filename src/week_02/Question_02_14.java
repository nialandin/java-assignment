package week_02;

import java.util.Scanner;

public class Question_02_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter weight in pounds : ");
        double pounds = input.nextDouble();

        System.out.println("Enter weight in pounds : ");
        double inches = input.nextDouble();


        double kilograms = pounds * 0.45359237;
        double metre = inches * 0.0254;


        double bmi = kilograms / (metre * metre);
        System.out.println("BMI is " + bmi);


    }

}
