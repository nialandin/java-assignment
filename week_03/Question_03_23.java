package assignments.src.week_03;

import java.util.Scanner;

public class Question_03_23 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a point with two coordinates: ");
        double p1 = input.nextInt();
        double p2 = input.nextInt();

        double x1 = -5;
        double y1 = 5/2;
        double x2 = 5;
        double y2 = -5/2;


        if ( p1 >= x1 && p1 <=x2 && p2 >= y1 && p2 <= y2 ){
            System.out.println("Point (" + p1 + " " + p2 + ") is not in the rectangle ");
        } else {
            System.out.println("Point (" + p1 + " " + p2 + ") is in the rectangle");
        }




    }
}
