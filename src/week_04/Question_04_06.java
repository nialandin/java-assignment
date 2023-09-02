package assignments.week_04_;

import java.awt.*;
import java.util.Scanner;

public class Question_04_06 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

double radius = 40;

double x1 = radius*Math.cos(Math.random()*361);
double x2 = radius*Math.cos(Math.random()*361);
double x3 = radius*Math.cos(Math.random()*361);
double y1 = radius*Math.cos(Math.random()*361);
double y2 = radius*Math.cos(Math.random()*361);
double y3 = radius*Math.cos(Math.random()*361);

        System.out.printf("The three angles are : %.0f.%.0f , %.0f.%.0f , %.0f.%.0f",x1,y1,x2,y2,x3,y3);

    }
}
