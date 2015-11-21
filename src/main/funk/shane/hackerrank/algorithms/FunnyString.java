package funk.shane.hackerrank.algorithms;

import java.util.Scanner;

/**
 * Created by Shane on 11/19/2015.
 */
public class FunnyString {
    private static final String F = "Funny";
    private static final String NF = "Not Funny";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < T; i++) {
            boolean isFunny = true;
            final StringBuilder sb = new StringBuilder(sc.nextLine());
            int n = sb.length();
            char[] S = sb.toString().toCharArray();
            char[] R = sb.reverse().toString().toCharArray();

            for(int j = 1; isFunny && j < n; j++) {
                isFunny = getValue(S[j], S[j-1]) == getValue(R[j], R[j-1]);
            }
            System.out.printf("%s%n", isFunny ? F : NF);
        }
    }

    private static int getValue(int m, int n) {
        return Math.abs(m - n);
    }
}
