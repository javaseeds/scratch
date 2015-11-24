package funk.shane.regex;

import java.util.Scanner;

/**
 * Created by Shane on 11/23/2015.
 */
public class HackerRank {
    private static final String startsWith = "^hackerrank.+";
    private static final String endsWith = ".+hackerrank$";
    private static final String only = "^hackerrank$";

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < N; i++) {
            final String str = sc.nextLine();
            if(str.matches(startsWith)){
                System.out.println(1);
            }
            else if(str.matches(endsWith)){
                System.out.println(2);
            }
            else if(str.matches(only)){
                System.out.println(0);
            }
            else {
                System.out.println(-1);
            }
        }
    }
}
