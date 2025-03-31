import java.math.BigInteger;

public class Num2 {

    public static void main(String[] args) {
        int count = 0;
        BigInteger number = new BigInteger("10").pow(49);
        BigInteger two = new BigInteger("2");
        BigInteger three = new BigInteger("3");


        while (count < 10) {
            if (isDivisibleBy2Or3(number, two, three)) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }

    private static boolean isDivisibleBy2Or3(BigInteger number, BigInteger two, BigInteger three) {
        return number.mod(two).equals(BigInteger.ZERO) || number.mod(three).equals(BigInteger.ZERO);
    }
}