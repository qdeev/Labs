public class MyIntegerTest {
    public static void main(String[] args) {
        MyInteger myInt1 = new MyInteger(16);
        MyInteger myInt2 = new MyInteger(17);
        MyInteger myInt3 = new MyInteger(19);

        System.out.println("myInt1.isEven(): " + myInt1.isEven());
        System.out.println("myInt2.isOdd(): " + myInt2.isOdd());
        System.out.println("myInt3.isPrime(): " + myInt3.isPrime());

        System.out.println("MyInteger.isEven(16): " + MyInteger.isEven(16));
        System.out.println("MyInteger.isOdd(17): " + MyInteger.isOdd(17));
        System.out.println("MyInteger.isPrime(19): " + MyInteger.isPrime(19));

        System.out.println("MyInteger.isEven(myInt1): " + MyInteger.isEven(myInt1));
        System.out.println("MyInteger.isOdd(myInt2): " + MyInteger.isOdd(myInt2));
        System.out.println("MyInteger.isPrime(myInt3): " + MyInteger.isPrime(myInt3));

        System.out.println("myInt1.equals(16): " + myInt1.equals(16));
        System.out.println("myInt1.equals(myInt2): " + myInt1.equals(myInt2));

        char[] digits = {'1', '2', '3'};
        String str = "456";
        System.out.println("MyInteger.parseInt(digits): " + MyInteger.parseInt(digits));
        System.out.println("MyInteger.parseInt(str): " + MyInteger.parseInt(str));
    }
}