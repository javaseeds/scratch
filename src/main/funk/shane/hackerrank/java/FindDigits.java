package funk.shane.hackerrank.java;

import java.util.Scanner;

/**
 * Created by Shane on 10/31/2015.
 */
public class FindDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int count = 0;

            long n = sc.nextLong();
            String digits = String.valueOf(n);
            for(int j = 0; j < digits.length(); j++) {
                int x = Character.digit(digits.charAt(j), 10);

                if(x != 0 && n % x == 0) {
                    count++;
                }
            }

            System.out.printf("%d%n", count);
        }
    }
}
