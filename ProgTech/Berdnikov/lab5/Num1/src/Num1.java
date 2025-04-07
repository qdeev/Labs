import java.math.BigInteger;

public class Num1 {

    public static void main(String[] args) {
        BigInteger longMaxValue = new BigInteger("9223372036854775807");
        BigInteger number = longMaxValue.add(BigInteger.ONE);

        int count = 0;
        while (count < 5) {
            if (number.isProbablePrime(100)) {
                System.out.println(number.toString());
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
}