public class MyStringBuilder2 {
    private char[] chars;

    public MyStringBuilder2() {
        this.chars = new char[0];
    }

    public MyStringBuilder2(char[] chars) {
        if (chars == null) {
            this.chars = new char[0];
        } else {
            this.chars = new char[chars.length];
            System.arraycopy(chars, 0, this.chars, 0, chars.length);
        }
    }

    public MyStringBuilder2(String s) {
        if (s == null) {
            this.chars = new char[0];
        } else {
            this.chars = s.toCharArray();
        }
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        if (offset < 0 || offset > chars.length) {
            throw new IndexOutOfBoundsException();
        }

        char[] newChars = new char[chars.length + s.chars.length];
        System.arraycopy(chars, 0, newChars, 0, offset);
        System.arraycopy(s.chars, 0, newChars, offset, s.chars.length);
        System.arraycopy(chars, offset, newChars, offset + s.chars.length, chars.length - offset);

        this.chars = newChars;
        return this;
    }

    public MyStringBuilder2 reverse() {
        char[] reversed = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reversed[i] = chars[chars.length - 1 - i];
        }
        this.chars = reversed;
        return this;
    }

    public MyStringBuilder2 substring(int begin) {
        if (begin < 0 || begin > chars.length) {
            throw new IndexOutOfBoundsException();
        }

        char[] subChars = new char[chars.length - begin];
        System.arraycopy(chars, begin, subChars, 0, subChars.length);
        return new MyStringBuilder2(new String(subChars));
    }

    public MyStringBuilder2 toUpperCase() {
        char[] upperChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            upperChars[i] = Character.toUpperCase(chars[i]);
        }
        this.chars = upperChars;
        return this;
    }

    @Override
    public String toString() {
        return new String(chars);
    }
}