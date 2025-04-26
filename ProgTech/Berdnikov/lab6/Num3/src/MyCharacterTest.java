public class MyCharacterTest {
    public static void main(String[] args) {
        MyCharacter c1 = new MyCharacter('a');
        MyCharacter c2 = new MyCharacter('b');

        System.out.println("c1.charValue(): " + c1.charValue());
        System.out.println("c1.compareTo(c2): " + c1.compareTo(c2));
        System.out.println("c1.equals(c2): " + c1.equals(c2));
        System.out.println("c1.isDigit(): " + c1.isDigit());

        System.out.println("MyCharacter.isDigit('5'): " + MyCharacter.isDigit('5'));
        System.out.println("MyCharacter.isLetter('A'): " + MyCharacter.isLetter('A'));
        System.out.println("MyCharacter.isLetterOrDigit('A'): " + MyCharacter.isLetterOrDigit('A'));
        System.out.println("MyCharacter.isLowerCase('a'): " + MyCharacter.isLowerCase('a'));
        System.out.println("MyCharacter.isUpperCase('A'): " + MyCharacter.isUpperCase('A'));
        System.out.println("MyCharacter.toUpperCase('a'): " + MyCharacter.toUpperCase('a'));
        System.out.println("MyCharacter.toLowerCase('A'): " + MyCharacter.toLowerCase('A'));
    }
}