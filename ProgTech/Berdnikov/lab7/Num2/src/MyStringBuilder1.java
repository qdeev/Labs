public class MyStringBuilder1 {
    private char[] chars;

    public MyStringBuilder1(String s) {
        if (s == null) {
            this.chars = new char[0];
        } else {
            this.chars = s.toCharArray();
        }
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        char[] newChars = new char[chars.length + s.chars.length];
        System.arraycopy(chars, 0, newChars, 0, chars.length);
        System.arraycopy(s.chars, 0, newChars, chars.length, s.chars.length);
        this.chars = newChars;
        return this;
    }

    public MyStringBuilder1 append(int i) {
        return append(new MyStringBuilder1(Integer.toString(i)));
    }

    public int length() {
        return chars.length;
    }

    public char charAt(int index) {
        if (index < 0 || index >= chars.length) {
            throw new IndexOutOfBoundsException();
        }
        return chars[index];
    }

    public MyStringBuilder1 toLowerCase() {
        char[] lowerChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            lowerChars[i] = Character.toLowerCase(chars[i]);
        }
        this.chars = lowerChars;
        return this;
    }

    public MyStringBuilder1 substring(int begin, int end) {
        if (begin < 0 || end > chars.length || begin > end) {
            throw new IllegalArgumentException();
        }
        char[] subChars = new char[end - begin];
        System.arraycopy(chars, begin, subChars, 0, subChars.length);
        return new MyStringBuilder1(new String(subChars));
    }

    @Override
    public String toString() {
        return new String(chars);
    }
}