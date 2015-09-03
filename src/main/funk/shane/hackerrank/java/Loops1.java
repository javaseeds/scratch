package funk.shane.hackerrank.java;

import java.util.Scanner;

/**
 * Created by Shane on 9/2/2015.
 */
public class Loops1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();

        //[a+2^0b], [a+2^0b]+2^1b],......, [a+2^0b+2^1b]+...+2^(n?1)b
        for(int i = 0; i < lines; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int x = a;

            for(int j = 0; j < n; j++) {
                x += (int)Math.pow(2.0, j) * b;
                System.out.printf("%d ", x);
            }
            System.out.println();
        }
    }
}
