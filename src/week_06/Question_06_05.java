package assignments.src.week_06;

import java.util.Scanner;

public class Question_06_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
kullanıcıdan üç tane numara alacağız
bu numaraları max ve  min ile sıralama yapacağız metodun içinde
 */
        System.out.print("Enter three numbers : ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3);

    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;

        if (num1 > num2) {    //9 5
            temp = num1;     //temp=9
            num1 = num2;     //num1=5
            num2 = temp;

        }

        if ((num2 > num3)) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }

        System.out.printf("%.1f %.1f %.1f  ", num1, num2, num3);
    }

}
