public class MyStringBuilder2Test {
    public static void main(String[] args) {
        MyStringBuilder2 sb1 = new MyStringBuilder2("Hello");

        System.out.println("Initial string: " + sb1.toString());
        MyStringBuilder2 sb2 = new MyStringBuilder2(" World");
        sb1.insert(5, sb2);
        System.out.println("After inserting ' World': " + sb1.toString());
        sb1.reverse();
        System.out.println("After reversing: " + sb1.toString());
        MyStringBuilder2 sub = sb1.substring(6);
        System.out.println("Substring starting at index 6: " + sub.toString());
        sb1.toUpperCase();
        System.out.println("After toUpperCase: " + sb1.toString());
    }
}