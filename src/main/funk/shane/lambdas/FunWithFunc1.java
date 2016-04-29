package funk.shane.lambdas;

/**
 * Created by Shane
 */
public class FunWithFunc1 {
    public static void main(String[] args) {
        FunWithFunc1 f1 = new FunWithFunc1();
        System.out.printf("fact of %d: %d%n", 5, f1.fact(5));
        System.out.printf("fact of %d: %d%n", 9, f1.fact(9));
    }

    int fact(final int n) {
        if(n <= 1) {
            return 1;
        }
        else
        {
            return n * fact(n - 1);
        }
    }
}
