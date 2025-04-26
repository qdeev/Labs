public class MyStringBuilder1Test {
    public static void main(String[] args) {
        MyStringBuilder1 sb1 = new MyStringBuilder1("Hello");

        System.out.println("Initial string: " + sb1.toString());
        sb1.append(new MyStringBuilder1(" World"));
        System.out.println("After appending ' World': " + sb1.toString());
        sb1.append(123);
        System.out.println("After appending 123: " + sb1.toString());
        System.out.println("Length: " + sb1.length());
        System.out.println("charAt(1): " + sb1.charAt(1));
        sb1.toLowerCase();
        System.out.println("After toLowerCase: " + sb1.toString());
        MyStringBuilder1 sub = sb1.substring(0, 5);
        System.out.println("Substring(0, 5): " + sub.toString());
    }
}