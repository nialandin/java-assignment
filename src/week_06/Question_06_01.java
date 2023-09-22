package assignments.src.week_06;

public class Question_06_01 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            int pentagonaNumber = getPentagonalNumber(i);
            System.out.printf("%9d", pentagonaNumber);

            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
    public static int getPentagonalNumber(int n) {

        return n * (3 * n - 1) / 2;

    }
}
