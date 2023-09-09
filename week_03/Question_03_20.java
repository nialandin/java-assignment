package assignments.week_03;

import java.util.Scanner;

public class Question_03_20 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit between -58F and 41F :");
        double temp = input.nextDouble();

        System.out.println("Enter the wind speed (<=2) in miles per hour :");
        double speed = input.nextDouble();

        if (temp < -58 || temp > 41) {
            System.out.println("The temperature invalid");
        }
        if (speed < 2) {
            System.out.println("The windspeed invalid");
        } else {
            double pow = Math.pow(speed, 0.16);
            double twc = 35.74 + 0.6215 * temp - 35.75 * pow + 0.4275 * temp * pow;

            System.out.println("The wind chill index is " + twc);
        }
    }

}