package assignments.src.week_06;

public class Question_06_13 {
    public static void main(String[] args) {

        System.out.printf("%-10s %-10s\n", "i", "m(i)");
        System.out.println("------------------");
        for (int i = 1; i <21 ; i++) {
            System.out.printf("%-10d %-10.4f", i, method(i));
            System.out.println();
        }
    }

    public static double method(int i) {
        double sum = 0;
        for (int j = 1; j < i + 1; j++) {
            sum += (double)j / (j + 1);
        }
        return sum;
    }
}
