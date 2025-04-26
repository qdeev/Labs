import java.sql.PreparedStatement;

public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }

    public char charAt(int index) {
        if (index < 0 || index >= chars.length) {
            throw new IndexOutOfBoundsException();
        }
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        if (begin < 0 || end > chars.length || begin > end) {
            throw new IllegalArgumentException();
        }
        char[] subChars = new char[end - begin];
        System.arraycopy(chars, begin, subChars, 0, subChars.length);
        return new MyString1(subChars);
    }

    public MyString1 toLowerCase() {
        char[] lowerChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            lowerChars[i] = Character.toLowerCase(chars[i]);
        }
        return new MyString1(lowerChars);
    }

    public static MyString1 valueOf(int i) {
        return new MyString1(Integer.toString(i).toCharArray());
    }

    public char[] toChars() {
        char[] result = new char[chars.length];
        System.arraycopy(chars, 0, result, 0, chars.length);
        return result;
    }


    public boolean equals(MyString1 obj) {
        if (obj == null || obj.length() != this.length()) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != obj.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return new String(chars);
    }
}