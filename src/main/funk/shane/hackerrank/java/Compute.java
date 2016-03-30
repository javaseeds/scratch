package funk.shane.hackerrank.java;

/**
 * Created by Shane on 3/15/2016.
 */
public interface Compute {
    int compute();
    default int doubleMe(int num) {
        return num * 2;
    }
    default int negateMe(int num) {
        return num * -1;
    }
}
