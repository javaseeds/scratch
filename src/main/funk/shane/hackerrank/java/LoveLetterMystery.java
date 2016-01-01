package funk.shane.hackerrank.java;

import java.util.Scanner;

/**
 * Created by Shane on 1/1/2016.
 */
public class LoveLetterMystery {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
        System.out.printf("%b%n", isPalindrome("abbd"));
        System.out.printf("%b%n", isPalindrome("abcbd"));
        System.out.printf("%b%n", isPalindrome("abcba"));
    }

    private static boolean isPalindrome(final String str) {
        final StringBuilder sb = new StringBuilder(str);

        int len = str.length();
        int middle = len / 2;

        String left = sb.substring(0, middle);
        String right = sb.reverse().substring(middle + len % 2);

//        String left = str.substring(0, middle);
//        String right = new StringBuilder(str.substring(middle + len % 2)).reverse().toString();

        return left.equalsIgnoreCase(right);
    }
}
