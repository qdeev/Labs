import java.math.BigInteger;

public class Num3 {

    public static void main(String[] args) {
        BigInteger longMaxValue = new BigInteger("9223372036854775807");

        BigInteger n = sqrt(longMaxValue).add(BigInteger.ONE);

        for (int count = 0; count < 10; count++) {
            BigInteger square = n.pow(2);
            System.out.println(square.toString());
            n = n.add(BigInteger.ONE);
        }
    }

    private static BigInteger sqrt(BigInteger value) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = new BigInteger(value.shiftRight(5).add(new BigInteger("8")).toString());

        while (b.compareTo(a) >= 0) {
            BigInteger mid = a.add(b).shiftRight(1); // Находим среднюю точку (аналогично (a + b) / 2)
            if (mid.multiply(mid).compareTo(value) > 0) {
                b = mid.subtract(BigInteger.ONE); // Если mid^2 > value, сужаем верхнюю границу
            } else {
                a = mid.add(BigInteger.ONE); // Иначе сужаем нижнюю границу
            }
        }
        return a.subtract(BigInteger.ONE);
    }
}