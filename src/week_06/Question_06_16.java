package assignments.src.week_06;

public class Question_06_16 {
    public static void main(String[] args) {

        System.out.printf("%-10s %-10s\n", "Year", "Days in year");
        System.out.println("-----------------------");
        for (int i = 2000; i < 2021; i++) {
            numberOfDaysInAYear(i);
            System.out.printf("%-10d     %-10d\n", i, numberOfDaysInAYear(i));
        }
    }

    public static int numberOfDaysInAYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return 366;
        } else {
            return 365;
        }
    }
}
