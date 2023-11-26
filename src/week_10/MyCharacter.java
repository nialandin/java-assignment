package assignments.week_10;

public class MyCharacter {
    public static boolean isLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean isLetterOrDigit(char c) {
        return isLetter(c) || isDigit(c);
    }

    public static boolean isUpperCase(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static boolean isLowerCase(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static char toUpperCase(char c) {
        if (isLowerCase(c)) {
            return (char) (c - 32);
        }
        return c;
    }

    public static char toLowerCase(char c) {
        if (isUpperCase(c)) {
            return (char) (c + 32);
        }
        return c;
    }
}
