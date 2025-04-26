public class MyString2 {
    private char[] chars;

    public MyString2(char[] chars) {
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }

    public MyString2 substring(int begin) {
        if (begin < 0 || begin > chars.length) {
            throw new IllegalArgumentException("Invalid substring start index");
        }
        char[] subChars = new char[chars.length - begin];
        System.arraycopy(chars, begin, subChars, 0, subChars.length);
        return new MyString2(subChars);
    }

    public MyString2 toUpperCase() {
        char[] upperChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            upperChars[i] = Character.toUpperCase(chars[i]);
        }
        return new MyString2(upperChars);
    }

    public char[] toChars() {
        char[] result = new char[chars.length];
        System.arraycopy(chars, 0, result, 0, chars.length);
        return result;
    }

    public static MyString2 valueOf(boolean b) {
        return new MyString2(Boolean.toString(b).toCharArray());
    }

    @Override
    public String toString() {
        return new String(chars);
    }
}