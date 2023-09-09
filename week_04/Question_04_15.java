package assignments.week_04_;

import java.util.Scanner;

public class Question_04_15 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter : ");
        String letter = input.nextLine();

        char c = letter.toUpperCase().charAt(0);
        int number = 0;

            if (c >= 'A' && c <= 'C') {
                number = 2;
            } else if (c >= 'D' && c <= 'F') {
                number = 3;
            } else if (c >= 'G' && c <= 'I') {
                number = 4;
            } else if (c >= 'J' && c <= 'L') {
                number = 5;
            } else if (c >= 'M' && c <= 'O') {
                number = 6;
            } else if (c >= 'P' && c <= 'S') {
                number = 7;
            } else if (c >= 'T' && c <= 'V') {
                number = 8;
            } else if (c >= 'W' && c <= 'Z') {
                number = 9;
            } else if (c == 0) {
                number = 0;
            } else if (c == '@'|| c == '_' || c == ','){
                System.out.println("aaa");
                number = 1;
            }else
                System.out.println(c + "is an invalid input");

            System.out.print("The corresponding number is " + number);
            }

        }



