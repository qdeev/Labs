public class MyString2Test {
    public static void main(String[] args) {
        char[] data = {'H', 'e', 'l', 'l', 'o'};
        MyString2 str1 = new MyString2(data);

        System.out.println("substring(1): " + str1.substring(1).toString());
        System.out.println("toUpperCase(): " + str1.toUpperCase().toString());

        char[] charsArray = str1.toChars();
        System.out.print("toChars(): ");
        for (char c : charsArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        MyString2 boolStr = MyString2.valueOf(true);
        System.out.println("valueOf(true): " + boolStr.toString());
    }
}