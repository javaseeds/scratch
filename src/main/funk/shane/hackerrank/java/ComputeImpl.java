package funk.shane.hackerrank.java;

public class ComputeImpl implements Compute {
    @Override
    public int compute() {
        return 0;
    }

    public static void main(String[] args) {
        ComputeImpl ci = new ComputeImpl();

        System.out.printf("ci double: %d, ci neg: %d, ci compute: %d%n", ci.doubleMe(5), ci.negateMe(7), ci.compute());
    }
}
