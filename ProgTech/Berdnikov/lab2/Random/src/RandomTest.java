import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            int randomNumber = random.nextInt(10000)+1000;
            System.out.print(randomNumber + " ");
        }
    }
}