package assignments.src.week_02;

import java.util.Scanner;

public class Question_02_01 {
public static void main (String [] args) {

    Scanner input = new Scanner (System.in);
    double Celcius = input.nextDouble();

    System.out.println("Enter a degree in Celsius");
    double fahrenheit = ( 9.0 / 5 * Celcius + 32 );

        System.out.println( Celcius + " Celsius is " + fahrenheit + " Fahrenheit");



}

}
