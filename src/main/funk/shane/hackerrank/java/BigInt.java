package funk.shane.hackerrank.java;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Shane on 9/13/2015.
 */
public class BigInt {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();
        add(a, b);
        mult(a, b);
    }

    private static void add(final BigInteger a, final BigInteger b) {
        System.out.println((a.add(b)).toString());
    }

    private static void mult(final BigInteger a, final BigInteger b) {
        System.out.println((a.multiply(b)).toString());
    }
}
