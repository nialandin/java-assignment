package assignments.week_10;

public class Question_10_19 {
    public static void main(String[] args) {
        System.out.printf("%-5s %-10s%n", "p", "2^p - 1");

        for (int p = 2; p <= 100; p++) {
            if (isPrime(p)) {
                long mersenneNumber = (long) Math.pow(2, p) - 1;
                if (isPrime((int) mersenneNumber)) {
                    System.out.printf("%-5d %-20d%n", p, mersenneNumber);
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
