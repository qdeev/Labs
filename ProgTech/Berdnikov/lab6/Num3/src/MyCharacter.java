public class MyCharacter {
    private char value;

    public MyCharacter(char value) {
        this.value = value;
    }

    public char charValue() {
        return value;
    }

    public int compareTo(MyCharacter anotherCharacter) {
        if (this.value > anotherCharacter.value) {
            return 1;
        } else if (this.value < anotherCharacter.value) {
            return -1;
        } else {
            return 0;
        }
    }

    public boolean equals(MyCharacter anotherCharacter) {
        if (anotherCharacter == null) {
            return false;
        }
        return this.value == anotherCharacter.value;
    }

    public boolean isDigit() {
        return value >= '0' && value <= '9';
    }

    public static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }

    public static boolean isLetter(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    public static boolean isLetterOrDigit(char ch) {
        return isDigit(ch) || isLetter(ch);
    }

    public static boolean isLowerCase(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    public static boolean isUpperCase(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    public static char toUpperCase(char ch) {
        if (isLowerCase(ch)) {
            return (char) (ch - ('a' - 'A'));
        }
        return ch;
    }

    public static char toLowerCase(char ch) {
        if (isUpperCase(ch)) {
            return (char) (ch + ('a' - 'A'));
        }
        return ch;
    }
}