import java.math.BigInteger;

public class Num2 {

    public static void main(String[] args) {
        System.out.println("p\t2^p - 1");
        for (int p = 2; p <= 100; p++) {
            BigInteger mersenneNumber = BigInteger.valueOf(2).pow(p).subtract(BigInteger.ONE);
            if (mersenneNumber.isProbablePrime(100)) {
                System.out.println(p + "\t" + mersenneNumber);
            }
        }
    }
}