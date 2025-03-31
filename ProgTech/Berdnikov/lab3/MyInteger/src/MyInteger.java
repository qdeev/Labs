public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        if (value <= 1) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public boolean equals(int n) {
        return value == n;
    }

    public boolean equals(MyInteger myInt) {
        return value == myInt.getValue();
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger myInt) {
        return isEven(myInt.getValue());
    }

    public static boolean isOdd(MyInteger myInt) {
        return isOdd(myInt.getValue());
    }

    public static boolean isPrime(MyInteger myInt) {
        return isPrime(myInt.getValue());
    }

    public static int parseInt(char[] digits) {
        int result = 0;
        for (char c : digits) {
            if (c >= '0' && c <= '9') {
                result = result * 10 + (c - '0');
            } else {
                throw new NumberFormatException("Invalid character in input.");
            }
        }
        return result;
    }

    public static int parseInt(String s) {
        return parseInt(s.toCharArray());
    }
}