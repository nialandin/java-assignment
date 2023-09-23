package assignments.src.week_06;


import java.util.Scanner;

public class Question_06_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s   %-10s  |   %-10s   %-10s", "Feet", "Meters", "Meters", "Feet");
        System.out.println("\n-----------------------------------------------");

        double meters = 20;

        for (double feet = 1; feet <= 10; feet++) {
            System.out.printf("%-10.1f %-10.3f    |    %-10.2f %-10.2f\n", feet, footToMeter(feet), meters, meterToFoot(meters));
            meters += 5;
        }

    }

    public static double footToMeter(double foot) {
        double meter = 0.305 * foot;
        return meter;
    }

    public static double meterToFoot(double meter) {
        double foot = 3.279 * meter;
        return foot;
    }
}
