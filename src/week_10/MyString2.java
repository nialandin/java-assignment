package assignments.week_10;

public class MyString2 {
    private char[] characters;

    public MyString2(String s) {
        characters = s.toCharArray();
    }

    public int compare(String s) {
        return toString().compareTo(s);
    }

    public MyString2 substring(int begin) {
        char[] substringChars = new char[characters.length - begin];
        System.arraycopy(characters, begin, substringChars, 0, characters.length - begin);
        return new MyString2(new String(substringChars));
    }

    public MyString2 toUpperCase() {
        char[] upperCaseChars = new char[characters.length];
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] >= 'a' && characters[i] <= 'z') {
                upperCaseChars[i] = (char) (characters[i] - 32);
            } else {
                upperCaseChars[i] = characters[i];
            }
        }
        return new MyString2(new String(upperCaseChars));
    }

    public char[] toChars() {
        return characters;
    }

    public static MyString2 valueOf(boolean b) {
        return new MyString2(String.valueOf(b));
    }
}
