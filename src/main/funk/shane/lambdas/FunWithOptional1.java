package funk.shane.lambdas;

import java.util.Optional;
import java.util.Random;

/**
 * Created by Shane
 */
public class FunWithOptional1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++) {
            final Optional<Integer> optInt = factorOf3isBomb();
            System.out.printf("[%s] ", optInt);
            if(i % 5 == 0) {
                System.out.println();
            }
        }
    }

    static Optional<Integer> factorOf3isBomb() {
        final Random random = new Random();
        final int  x= random.nextInt(101);

        return x % 3 == 0 ? Optional.ofNullable(null) : Optional.of(x);
    }
}
