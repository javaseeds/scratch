package funk.shane.hackerrank.java;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Shane on 9/2/2015.
 */
public class StandardIn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        BigDecimal bg = sc.nextBigDecimal();
        String s = sc.next() + sc.nextLine();

        System.out.printf("String: %s%n", s);
        System.out.printf("Double: %s%n", bg.doubleValue());
        System.out.printf("Int: %d%n", x);
    }
}
