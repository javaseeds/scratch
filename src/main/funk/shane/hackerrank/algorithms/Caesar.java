package funk.shane.hackerrank.algorithms;

import java.util.Scanner;

/**
 * Created by Shane on 1/16/2016.
 */
public class Caesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        char[] S = (sc.nextLine()).toCharArray();
        int K = Integer.parseInt(sc.nextLine());

        int ch;

        for(int i = 0; i < S.length; i++) {
            if(Character.isLetter(S[i])) {
                if(Character.isUpperCase(S[i])) {
                    ch = S[i];
                }
            }
        }
    }
}
