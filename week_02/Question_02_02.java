package assignments.src.week_02;

import java.util.Scanner;

public class Question_02_02 {

    public static void main (String [] args ){
        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length and radius of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();



        double area = ( radius * radius * PI );
        double volume = area * length;

        System.out.println("The area is " + area );
        System.out.println("The volume is " + volume);










    }

}
