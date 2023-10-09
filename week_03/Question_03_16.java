package assignments.src.week_03;

import java.util.Scanner;

public class Question_03_16 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int y = (int) ((Math.random() * 200) - 100);
        int x = (int) ((Math.random() * 100) - 50);


        System.out.println("Random coordinate in rectangle at" +
                " (0,0= with width 100 and height 200: (" + x + " , " + y + ") ");


    }

}
