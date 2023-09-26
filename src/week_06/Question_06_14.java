package assignments.src.week_06;

public class Question_06_14 {
    public static void main(String[] args) {

        System.out.printf("%-10s %-10s\n", "i", "m(i)");
        System.out.println("------------------");

        for (int i = 1; i < 902; i += 100) {
            System.out.printf("%-10d %-10.4f\n", i, formal(i));
        }
    }

    public static double formal(int i) {
        double sum = 0;
        for (int j = 1; j < i + 1; j++) {
            sum += ((Math.pow(-1, j + 1)) / (2 * j - 1)) * 4;
        }
        return sum;
    }
}
