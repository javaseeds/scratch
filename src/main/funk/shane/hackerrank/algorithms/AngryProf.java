package funk.shane.hackerrank.algorithms;

import java.util.Scanner;

/**
 * Created by Shane on 9/9/2015.
 */
public class AngryProf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int x, y, z;

        for(int i = 0; i < testCases; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            x = 0;
            y = 0;
            z = 0;

            int val = 0;
            for(int j = 0; j < n; j++) {
                val = sc.nextInt();
                if(val < 0) {
                    x++;
                } else if( val == 0) {
                    y++;
                } else {
                    z++;
                }
            }
            System.out.printf("%s%n", (x < (n - k)) ? "YES" : "NO");
        }
    }
}
