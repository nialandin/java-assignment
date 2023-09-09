package assignments.week_04_;

import java.util.Scanner;

public class Question_04_03 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        double atlantaX = Math.toRadians(33.7489954);
        double atlantaY = Math.toRadians(-84.3879824);

        double orlandoX = Math.toRadians(28.5383355);
        double orlandoY = Math.toRadians(-81.3792364999);

        double savannahX = Math.toRadians(32.0835407);
        double savannahY = Math.toRadians(-81.09983419999998);

        double charlotteX = Math.toRadians(35.2270869);
        double charlotteY = Math.toRadians(-80.84312669999997);

        double radius = 6371.01;

        double distance1 = radius * Math.acos(Math.sin(orlandoX) * Math.sin(savannahX) +
                Math.cos(orlandoX) * Math.cos(savannahX) * Math.cos(orlandoY - savannahY));

        double distance2 = radius * Math.acos(Math.sin(charlotteX) * Math.sin(savannahX) +
                Math.cos(charlotteX) * Math.cos(savannahX) * Math.cos(charlotteY - savannahY));

        double distance3 = radius * Math.acos(Math.sin(charlotteX) * Math.sin(atlantaX) +
                Math.cos(charlotteX) * Math.cos(atlantaX) * Math.cos(charlotteY - atlantaY));

        double distance4 = radius * Math.acos(Math.sin(orlandoX) * Math.sin(atlantaX) +
                Math.cos(orlandoX) * Math.cos(atlantaX) * Math.cos(orlandoY - atlantaY));

        double distance5 = radius * Math.acos(Math.sin(orlandoX) * Math.sin(charlotteX) +
                Math.cos(orlandoX) * Math.cos(charlotteX) * Math.cos(orlandoY - charlotteY));

        double s1 = (distance1 + distance2 + distance5) / 2;
        double s2 = (distance3 + distance4 + distance5) / 2;

        double area1 = Math.sqrt(s1 * (s1 - distance1) * (s1 - distance2) * (s1 - distance5));
        double area2 = Math.sqrt(s2 * (s2 - distance3) * (s2 - distance4) * (s2 - distance5));

        double areaFourCities = area1 + area2;

        System.out.println("Estimated area enclosed bt these four cities : " + areaFourCities);

    }

}
