package assignments.src.week_02;

import java.util.Scanner;

public class Question_02_12 {
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

          System.out.println("Enter speed and acceleration : ");
            double speed = input.nextDouble();
            double acceleration = input.nextDouble();
            double length = Math.pow(speed,2) / (2.0 * acceleration);


System.out.println("The minimum runway length for this airplane is " + length );

//60 3,5




        }
    }