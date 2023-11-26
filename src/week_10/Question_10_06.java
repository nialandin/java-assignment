package assignments.week_10;

public class Question_10_06 {
    public static void main(String[] args) {

        StackOfIntegers primes = new StackOfIntegers();

        for (int number = 2; number < 120; number++) {
            if (isPrime(number)) {
                primes.push(number);
            }
        }

        while (!primes.isEmpty()) {
            int prime = primes.pop();
            System.out.print(prime + " ");
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
