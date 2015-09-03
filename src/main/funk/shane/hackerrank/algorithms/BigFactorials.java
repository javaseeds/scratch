package funk.shane.hackerrank.algorithms;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Shane on 8/30/2015.
 */
public class BigFactorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();
        BigInteger bd = BigInteger.ONE;

        for(int i = 1; i <= fact; i++) {
            bd = bd.multiply(BigInteger.valueOf(i));
            System.out.printf("i: %d fact: %s%n", i, bd.toString());
        }

        System.out.println(bd.toString());
    }
}
