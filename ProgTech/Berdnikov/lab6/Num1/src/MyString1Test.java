public class MyString1Test {
    public static void main(String[] args) {
        char[] data = {'H', 'e', 'l', 'l', 'o'};
        MyString1 str1 = new MyString1(data);

        System.out.println("charAt(1): " + str1.charAt(1));
        System.out.println("length(): " + str1.length());
        System.out.println("substring(1, 4): " + str1.substring(1, 4).toString());
        System.out.println("toLowerCase(): " + str1.toLowerCase().toString());

        MyString1 str2 = new MyString1(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println("equals(str2): " + str1.equals(str2));
        System.out.println("equals(str2.toLowerCase()): " + str1.toLowerCase().equals(str2));

        MyString1 numStr = MyString1.valueOf(123);
        System.out.println("valueOf(123): " + numStr.toString());

        char[] charsArray = numStr.toChars();
        System.out.print("toChars(): ");
        for (char c : charsArray) {
            System.out.print(c + " ");
        }
    }
}