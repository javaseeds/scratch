package funk.shane.lambdas.defaults;

/**
 * Created by Shane
 */
public class ComputableImpl implements Computable {
    @Override
    public int compute() {
        return 0;
    }

    public static void main(String[] args) {
        ComputableImpl ci = new ComputableImpl();
        System.out.printf("ci double: %d%n", ci.doubleNumber(4));
        System.out.printf("ci negate: %d%n", ci.negateNumber(4));
        System.out.printf("ci negate: %d%n", ci.compute());
    }
}
