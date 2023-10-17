package assignments.src.week_07;

import java.util.Scanner;

public class Question_07_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] animals = {
                "monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"
        };

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        int animalIndex = year % 12;
        String animal = animals[animalIndex];

        System.out.println(year + " is a year of " + animal + " in zodiac ");


    }
}
