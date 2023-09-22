package assignments.src.week_06;

import java.util.Scanner;

public class Question_06_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
kullanıcıdan üç tane numara alacağız
bu numaraları max ve  min ile sıralama yapacağız metodun içinde
 */
        System.out.println("Enter three numbers");
       double num1 = input.nextDouble();
       double num2 = input.nextDouble();
       double num3 = input.nextDouble();

        displaySortedNumbers(num3, num1, num2);

    }

    public static void displaySortedNumbers(double num1, double num2, double num3){
         
    }

}
