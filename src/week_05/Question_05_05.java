package assignments.src.week_05;

import java.util.Scanner;

public class Question_05_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("%-10s %10s | %-10s %-10s", "Kilograms", "Pounds", "Miles", "Kilometers");

        for (int i = 1, j = 20; i <= 200 && j <= 515; i += 2, j += 5) {
                double pound = i * 2.2;
                double kilograms = j * 0.45359237;
                System.out.printf("\n%-10d %10.1f | %-10d %10.2f", i, pound, j, kilograms);

            }
        }
    }

