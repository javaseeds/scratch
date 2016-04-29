package funk.shane.lambdas.defaults;

/**
 * Created by Shane
 */
public interface Computable {
    int compute();

    default int doubleNumber(int num) {
        return 2 * num;
    }

    default int negateNumber(int num) {
        return -1 * num;
    }
}
