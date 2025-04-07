import java.math.BigInteger;

public class Num3 {

    public static void main(String[] args) {
        BigInteger longMaxValue = new BigInteger("9223372036854775807");
        BigInteger number = longMaxValue.add(BigInteger.ONE);

        int count = 0;
        while (count < 10) {
            if (isDivisibleBy5Or6(number)) {
                System.out.println(number.toString());
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }

    private static boolean isDivisibleBy5Or6(BigInteger number) {
        return number.mod(BigInteger.valueOf(5)).equals(BigInteger.ZERO) ||
                number.mod(BigInteger.valueOf(6)).equals(BigInteger.ZERO);
    }
}