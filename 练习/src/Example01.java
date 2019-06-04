import java.util.Random;

public class Example01 {
    public static void main(String[] args) {

        Random random1 = new Random(10);
        Random random2 = new Random(10);
        for (int i = 0; i < 5; i++) {
            System.out.print(random1.nextInt(5));
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(random2.nextInt(5));
        }
    }
}
