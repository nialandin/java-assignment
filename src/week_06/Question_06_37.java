package assignments.src.week_06;

import java.util.Scanner;

public class Question_06_37 {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number and its width: ");
        int number = input.nextInt();
        int width = input.nextInt();
        System.out.println("34 formatted to width 4:" + format(number, width));
    }


    public static String format(int number, int width) {
        String strNumber = String.valueOf(number);
        for (int i = strNumber.length(); i < width; i++) {
            strNumber = "0" + strNumber;
        }
        return strNumber;
    }

}

