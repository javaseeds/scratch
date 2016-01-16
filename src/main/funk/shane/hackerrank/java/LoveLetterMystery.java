package funk.shane.hackerrank.java;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Shane on 1/1/2016.
 */
public class LoveLetterMystery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < T; i++) {
            String str = sc.nextLine();
            while(!isPalindrome(str)) {
                final char[] charArr = str.toCharArray();


                str = Arrays.toString(charArr);
            }
        }
    }

    private static boolean isPalindrome(final String str) {
        final StringBuilder sb = new StringBuilder(str);
        int middle = str.length() / 2;

        return sb.substring(0, middle).equalsIgnoreCase(sb.reverse().substring(0, middle));
    }
}
