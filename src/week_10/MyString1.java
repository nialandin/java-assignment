package assignments.week_10;

public class MyString1 {
    private char[] characters;

    public MyString1(char[] chars) {
        characters = new char[chars.length];
        System.arraycopy(chars, 0, characters, 0, chars.length);
    }

    public char charAt(int index) {
        return characters[index];
    }

    public int length() {
        return characters.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] substringChars = new char[end - begin];
        System.arraycopy(characters, begin, substringChars, 0, end - begin);
        return new MyString1(substringChars);
    }

    public MyString1 toLowerCase() {
        char[] lowerCaseChars = new char[characters.length];
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] >= 'A' && characters[i] <= 'Z') {
                lowerCaseChars[i] = (char) (characters[i] + 32);
            } else {
                lowerCaseChars[i] = characters[i];
            }
        }
        return new MyString1(lowerCaseChars);
    }

    public boolean equals(MyString1 s) {
        if (s == null || s.length() != characters.length) {
            return false;
        }

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != s.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static MyString1 valueOf(int i) {
        int length = String.valueOf(i).length();
        char[] intChars = new char[length];

        for (int j = length - 1; j >= 0; j--) {
            intChars[j] = (char) ((i % 10) + '0');
            i /= 10;
        }

        return new MyString1(intChars);
    }
}