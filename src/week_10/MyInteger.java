package assignments.week_10;

public class MyInteger {
  private int value;


    public MyInteger(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public boolean isEven() {
        if (getValue() % 2 == 0) {
            return true;
        }
        return false;
    }

    public boolean isOdd() {
        if (getValue() % 2 == 1) {
            return true;
        }
        return false;
    }

    public boolean isPrime() {
        if (value < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int value) {
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isOdd(int value) {
        if (value % 2 == 1) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int value) {
        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInteger) {
        return this.value == myInteger.getValue();
    }

    public static int parseInt(char[] chars) {
        return Integer.parseInt(new String(chars));
    }


    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }

}
