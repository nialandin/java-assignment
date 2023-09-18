package assignments.src.week_03;

import java.util.Scanner;

public class Question_03_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double randomNumber = (int) (Math.random() * 2);

        System.out.println("Guess the flip of coin (0 represents head and 1 represents tail ) : ");
int guess = input.nextInt();

        System.out.println(randomNumber);

if ( guess == randomNumber ) {
    System.out.println("Your guess is correct");
} else {
    System.out.println("You guess is incorrect");
}




    }
}
